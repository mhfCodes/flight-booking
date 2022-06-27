package com.hossein.FlightBooking.modelMapper.typeMaps.flights;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hossein.FlightBooking.dto.flights.FlightsDto;
import com.hossein.FlightBooking.modelMapper.config.GenericMapper;
import com.hossein.FlightBooking.models.flights.Flights;

@Configuration
public class DtoToFlightsEntity extends GenericMapper {

	public DtoToFlightsEntity(ModelMapper mapper) {
		super(mapper);
	}
	
	@Bean
	public TypeMap<FlightsDto, Flights> dToEFlights() {
		TypeMap<FlightsDto, Flights> propMap = super.mapProperties(FlightsDto.class, Flights.class);
		propMap.addMapping(FlightsDto::getId, Flights::setId);
		propMap.addMapping(FlightsDto::getoCountry, Flights::setOriginCountry);
		propMap.addMapping(FlightsDto::getoCity, Flights::setOriginCity);
		propMap.addMapping(FlightsDto::getdCountry, Flights::setDestinationCountry);
		propMap.addMapping(FlightsDto::getdCity, Flights::setDestinationCity);
		propMap.addMapping(FlightsDto::getFlightNum, Flights::setFlightNumber);
		propMap.addMapping(FlightsDto::getFlightDate, Flights::setFlightDate);
		propMap.addMapping(FlightsDto::getFlightTime, Flights::setFlightTime);
		propMap.addMapping(FlightsDto::getPrice, Flights::setPrice);
		return propMap;
	}

}
