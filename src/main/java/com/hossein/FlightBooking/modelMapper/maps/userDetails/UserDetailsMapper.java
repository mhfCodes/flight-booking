package com.hossein.FlightBooking.modelMapper.maps.userDetails;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.hossein.FlightBooking.dto.userDetails.UserDetailsDto;
import com.hossein.FlightBooking.modelMapper.config.GenericMapper;
import com.hossein.FlightBooking.models.userDetails.UserDetailsModel;

@Component
public class UserDetailsMapper extends GenericMapper {

	public UserDetailsMapper(ModelMapper mapper) {
		super(mapper);
	}
	
	public UserDetailsModel map(UserDetailsDto dto) {
		return super.map(dto, UserDetailsModel.class);
	}

}
