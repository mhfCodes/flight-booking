package com.hossein.FlightBooking.dao.custom.userDetails;

import java.util.List;

import com.hossein.FlightBooking.controllers.viewModels.userDetails.UserDetailsViewModel;
import com.hossein.FlightBooking.dto.userDetails.UserDetailsDto;

public interface IUserDetailsCustomRepository {

	List<UserDetailsViewModel> getAll(UserDetailsDto data);
}
