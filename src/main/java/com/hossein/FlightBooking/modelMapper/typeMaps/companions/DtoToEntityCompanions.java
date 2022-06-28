package com.hossein.FlightBooking.modelMapper.typeMaps.companions;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hossein.FlightBooking.dto.companions.CompanionsDto;
import com.hossein.FlightBooking.modelMapper.config.GenericMapper;
import com.hossein.FlightBooking.models.companions.Companions;

@Configuration
public class DtoToEntityCompanions extends GenericMapper {

	public DtoToEntityCompanions(ModelMapper mapper) {
		super(mapper);
	}

	@Bean
	public TypeMap<CompanionsDto, Companions> dToECompanions() {
		TypeMap<CompanionsDto, Companions> propMap = super.mapProperties(CompanionsDto.class, Companions.class);
		propMap.addMapping(CompanionsDto::getId, Companions::setId);
		propMap.addMapping(CompanionsDto::getBookingId, (dest, v) -> dest.getBooking().setId((Long) v));
		propMap.addMapping(CompanionsDto::getfName, Companions::setFirstName);
		propMap.addMapping(CompanionsDto::getlName, Companions::setLastName);
		propMap.addMapping(CompanionsDto::getAge, Companions::setAge);
		return propMap;
	}
	
}
