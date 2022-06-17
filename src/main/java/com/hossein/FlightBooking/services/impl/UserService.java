package com.hossein.FlightBooking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hossein.FlightBooking.dao.UserRepository;
import com.hossein.FlightBooking.models.UserModel;
import com.hossein.FlightBooking.services.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public long saveEntity(UserModel user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		UserModel savedEntity = this.userRepo.save(user);
		return savedEntity.getId();
	}

}
