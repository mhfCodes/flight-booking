package com.hossein.FlightBooking.services.bookings;

import java.util.List;

import com.hossein.FlightBooking.controllers.viewModels.bookings.BookingsViewModel;
import com.hossein.FlightBooking.dto.bookings.BookingsDto;
import com.hossein.FlightBooking.models.bookings.Bookings;

public interface IBookingsService {
	
	List<BookingsViewModel> getAll(BookingsDto data);
	
	Bookings loadById(Long id);
	
	long saveEntity(Bookings entity);
	
	Boolean deleteEntity(Long id);
}
