package com.hossein.FlightBooking.modelMapper.typeMaps.bookings;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hossein.FlightBooking.dto.bookings.BookingsDto;
import com.hossein.FlightBooking.modelMapper.config.GenericMapper;
import com.hossein.FlightBooking.models.bookings.Bookings;

@Configuration
public class DtoToEntityBookings extends GenericMapper {

	public DtoToEntityBookings(ModelMapper mapper) {
		super(mapper);
	}
	
	@Bean
	public TypeMap<BookingsDto, Bookings> dToEBookings() {
		TypeMap<BookingsDto, Bookings> propMap = super.mapProperties(BookingsDto.class, Bookings.class);
		propMap.addMapping(BookingsDto::getId, Bookings::setId);
		propMap.addMapping(BookingsDto::getUserId, (dest, v) -> dest.getUser().setId((Long) v));
		propMap.addMapping(BookingsDto::getFlightId, (dest, v) -> dest.getFlight().setId((Long) v));
		propMap.addMapping(BookingsDto::getPersonNum, Bookings::setPersons);
		return propMap;
	}

}
