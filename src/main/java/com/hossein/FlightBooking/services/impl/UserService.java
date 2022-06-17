package com.hossein.FlightBooking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hossein.FlightBooking.dao.UserRepository;
import com.hossein.FlightBooking.models.UserModel;
import com.hossein.FlightBooking.services.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public long saveEntity(UserModel user) {
		UserModel savedEntity = this.userRepo.save(user);
		return savedEntity.getId();
	}

}
