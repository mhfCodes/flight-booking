package com.hossein.FlightBooking.modelMapper.typeMaps;

import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hossein.FlightBooking.dto.UserDto;
import com.hossein.FlightBooking.modelMapper.GenericMapper;
import com.hossein.FlightBooking.models.UserModel;

@Configuration
public class UserDtoToEntity extends GenericMapper {
	
	@Bean
	public TypeMap<UserDto, UserModel> userDtoToEntityTypeMap() {
		TypeMap<UserDto, UserModel> propMap = super.mapProperties(UserDto.class, UserModel.class);
		propMap.addMapping(UserDto::getUserEmail, UserModel::setEmail);
		propMap.addMapping(UserDto::getUsername, UserModel::setUsername);
		propMap.addMapping(UserDto::getUserPass, UserModel::setPassword);
		propMap.addMapping(src -> src.getRoleId(), (dest, v) -> dest.getRole().setId((Long) v));
		return propMap;
	}
	
}
