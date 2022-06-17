package com.hossein.FlightBooking.modelMapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;

public class GenericMapper {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public <S, T> T map(S source, Class<T> targetClass) {
		return this.modelMapper.map(source, targetClass);
	}

	public <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
		return source
				.stream()
				.map(element -> this.modelMapper.map(element, targetClass))
				.collect(Collectors.toList());
	}
	
	public <S, T> TypeMap<S, T> mapProperties(Class<S> sourceClass, Class<T> targetClass) {
		TypeMap<S, T> propertyMapper = this.modelMapper.createTypeMap(sourceClass, targetClass);
		return propertyMapper;
	}
	
}
