package com.hossein.FlightBooking.services.impl.bookings;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hossein.FlightBooking.controllers.viewModels.bookings.BookingsViewModel;
import com.hossein.FlightBooking.dao.repositories.bookings.IBookingsRepository;
import com.hossein.FlightBooking.dto.bookings.BookingsDto;
import com.hossein.FlightBooking.exceptions.ApplicationException;
import com.hossein.FlightBooking.models.bookings.Bookings;
import com.hossein.FlightBooking.models.infrastructure.UserModel;
import com.hossein.FlightBooking.services.bookings.IBookingsService;
import com.hossein.FlightBooking.services.infrastructure.IUserService;

@Service
public class BookingsService implements IBookingsService {
	
	@Autowired
	private IBookingsRepository iBookingsRepository;
	
	@Autowired
	private IUserService iUserService;

	@Override
	public List<BookingsViewModel> getAll(BookingsDto data) {
		Long userId = this.iUserService.getLoggedInUser();
		UserModel user = this.iUserService.loadById(userId);
		if (user.getRole().getRoleName().equals("ROLE_ADMIN")) {
			data.setUserId(null);
		} else if (user.getRole().getRoleName().equals("ROLE_PASSENGER")) {
			data.setUserId(userId);
		}
		return this.iBookingsRepository.getAll(data);
	}

	@Override
	public Bookings loadById(Long id) {
		Bookings booking = this.iBookingsRepository.findById(id)
				.orElseThrow(() -> new ApplicationException("Booking Not Found"));
		if (this.iUserService.getLoggedInUser() != booking.getUser().getId()) throw new ApplicationException("You Are Not Allowed To View This Booking");
		return booking;
	}

	@Override
	@Transactional
	public long saveEntity(Bookings entity) {
		if (entity.getPersons() == null) entity.setPersons(0);
		return this.iBookingsRepository.save(entity).getId();
	}

	@Override
	@Transactional
	public Boolean deleteEntity(Long id) {
		if (id != null) {
			Bookings booking = this.iBookingsRepository.findById(id)
					.orElseThrow(() -> new ApplicationException("Booking Can Not Be Found"));
			if (this.iUserService.getLoggedInUser() != booking.getUser().getId()) throw new ApplicationException("You Are Not Allowed To Delete This Booking");
			this.iBookingsRepository.deleteById(id);
			Optional<Bookings> entity = this.iBookingsRepository.findById(id);
			if (entity.isPresent()) return false;
			return true;
		} else {
			throw new ApplicationException("Id Can Not Be Empty");
		}
	}

}
