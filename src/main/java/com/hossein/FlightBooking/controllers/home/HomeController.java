package com.hossein.FlightBooking.controllers.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hossein.FlightBooking.services.infrastructure.IUserService;

@RestController
@RequestMapping("/flightBooking")
public class HomeController {
	
	@Autowired
	private IUserService iUserService;
	
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_PASSENGER')")
	@GetMapping("/user")
	public String getUserHome() {
		User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return "Hi " + loggedInUser.getUsername() + " Welcome To Flight Booking App";
	}

}
