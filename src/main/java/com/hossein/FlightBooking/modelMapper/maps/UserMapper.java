package com.hossein.FlightBooking.modelMapper.maps;

import org.springframework.stereotype.Component;

import com.hossein.FlightBooking.dto.UserDto;
import com.hossein.FlightBooking.modelMapper.GenericMapper;
import com.hossein.FlightBooking.models.UserModel;

@Component
public class UserMapper extends GenericMapper {

	public UserModel map(UserDto userDto) {
		return super.map(userDto, UserModel.class);
	}
	
}
