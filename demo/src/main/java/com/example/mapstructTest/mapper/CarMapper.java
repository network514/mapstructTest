package com.example.mapstructTest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.mapstructTest.dto.CarDto;
import com.example.mapstructTest.dto.PersonDto;
import com.example.mapstructTest.model.Car;
import com.example.mapstructTest.model.Person;

@Mapper
public interface CarMapper {
	CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );
	/*
    @Mappings({
        @Mapping(source = "make", target = "manufacturer"),
        @Mapping(source = "numberOfSeats", target = "seatCount")
    })
    */
    CarDto carToCarDto(Car car);

    @Mapping(source = "name", target = "fullName")
    PersonDto personToPersonDto(Person person);
}
