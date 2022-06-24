package com.hossein.FlightBooking.services.impl.infrastructure;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hossein.FlightBooking.dao.dataJpaRepos.infrastructure.UserRepository;
import com.hossein.FlightBooking.models.infrastructure.UserModel;
import com.hossein.FlightBooking.services.infrastructure.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	@Transactional
	public long saveEntity(UserModel user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		UserModel savedEntity = this.userRepo.save(user);
		return savedEntity.getId();
	}

}
