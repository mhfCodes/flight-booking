package com.hossein.FlightBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hossein.FlightBooking.dto.UserDto;
import com.hossein.FlightBooking.modelMapper.maps.UserMapper;
import com.hossein.FlightBooking.services.IUserService;

@RestController
@RequestMapping("/signup")
public class SignupController {
	
	@Autowired
	private IUserService iUserService;
	
	@Autowired
	private UserMapper mapper;

	@PostMapping
	public long signUp(@RequestBody UserDto userDto) {
		return this.iUserService.saveEntity(this.mapper.map(userDto));
	}
	
}
