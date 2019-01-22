package com.example.mapstructTest.mapper;

import java.util.ArrayList;

import com.example.mapstructTest.dto.CarDto;
import com.example.mapstructTest.dto.EngineDto;
import com.example.mapstructTest.dto.PersonDto;
import com.example.mapstructTest.model.Car;
import com.example.mapstructTest.model.Engine;
import com.example.mapstructTest.model.Person;

public class CarMapperImpl implements CarMapper {

	@Override
	public CarDto carToCarDto(Car car) {
		if ( car == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        if ( car.getFeatures() != null ) {
            carDto.setFeatures( new ArrayList<String>( car.getFeatures() ) );
        }
        carDto.setManufacturer( car.getMake() );
        carDto.setSeatCount( car.getNumberOfSeats() );
        carDto.setDriver( personToPersonDto( car.getDriver() ) );
        carDto.setPrice( String.valueOf( car.getPrice() ) );
        if ( car.getCategory() != null ) {
            carDto.setCategory( car.getCategory().toString() );
        }
        carDto.setEngine( engineToEngineDto( car.getEngine() ) );

        return carDto;
	}

	@Override
	public PersonDto personToPersonDto(Person person) {
		if ( person == null ) {
            return null;
        }

        PersonDto personDto = new PersonDto();

        personDto.setFullName(person.getName());
        personDto.setAge(person.getAge());

        return personDto;
	}

	private EngineDto engineToEngineDto(Engine engine) {
        if ( engine == null ) {
            return null;
        }

        EngineDto engineDto = new EngineDto();

        engineDto.setHorsePower(engine.getHorsePower());
        engineDto.setFuel(engine.getFuel());

        return engineDto;
    }

}
