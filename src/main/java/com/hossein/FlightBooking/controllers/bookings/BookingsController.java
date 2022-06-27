package com.hossein.FlightBooking.controllers.bookings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hossein.FlightBooking.controllers.viewModels.bookings.BookingsViewModel;
import com.hossein.FlightBooking.dto.bookings.BookingsDto;
import com.hossein.FlightBooking.modelMapper.maps.bookings.DBookingsMapper;
import com.hossein.FlightBooking.modelMapper.maps.bookings.VBookingsMapper;
import com.hossein.FlightBooking.services.bookings.IBookingsService;
import com.hossein.FlightBooking.services.infrastructure.IUserService;

@RestController
@RequestMapping("/flightBooking/bookings")
public class BookingsController {

	@Autowired
	private IBookingsService iBookingsService;
	
	@Autowired
	private IUserService iUserService;
	
	@Autowired
	private VBookingsMapper vMapper;
	
	@Autowired
	private DBookingsMapper dMapper;
	
	@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_PASSENGER')")
	@PostMapping("/list/grid")
	public List<BookingsViewModel> getAll(@RequestBody BookingsDto data) {
		return iBookingsService.getAll(data);
	}
	
	@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_PASSENGER')")
	@GetMapping("/load/{id}")
	public BookingsViewModel load(@PathVariable Long id) {
		return this.vMapper.map(this.iBookingsService.loadById(id));
	}
	
	@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_PASSENGER')")
	@PostMapping("/save")
	public long save(@RequestBody BookingsDto data) {
		data.setUserId(this.iUserService.getLoggedInUser());
		return this.iBookingsService.saveEntity(this.dMapper.map(data));
	}
	
	@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_PASSENGER')")
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable Long id) {
		return this.iBookingsService.deleteEntity(id);
	}
	
}
