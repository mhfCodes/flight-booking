package com.hossein.FlightBooking.services.infrastructure;

import com.hossein.FlightBooking.models.infrastructure.UserModel;

public interface IUserService {
	
	long saveEntity(UserModel user);

	Long getLoggedInUser();
	
	UserModel loadById(Long id);
}
