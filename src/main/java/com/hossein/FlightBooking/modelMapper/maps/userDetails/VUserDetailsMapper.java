package com.hossein.FlightBooking.modelMapper.maps.userDetails;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.hossein.FlightBooking.controllers.viewModels.userDetails.UserDetailsViewModel;
import com.hossein.FlightBooking.modelMapper.config.GenericMapper;
import com.hossein.FlightBooking.models.userDetails.UserDetailsModel;

@Component
public class VUserDetailsMapper extends GenericMapper {

	public VUserDetailsMapper(ModelMapper mapper) {
		super(mapper);
	}

	public UserDetailsViewModel map(UserDetailsModel entity) {
		return super.map(entity, UserDetailsViewModel.class);
	}
	
}
