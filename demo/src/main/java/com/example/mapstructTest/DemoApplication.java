package com.example.mapstructTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mapstructTest.dto.CarDto;
import com.example.mapstructTest.mapper.CarMapper;
import com.example.mapstructTest.model.Car;
import com.example.mapstructTest.model.Person;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Car car = new Car();
		Person driver = new Person();
		driver.setName("Ryan");
		driver.setAge(20);
		car.setDriver(driver);
		car.setCategory("운전자");
		car.setMake("Tube");
		car.setNumberOfSeats(8);

		System.out.println("car value ::::::::::::::::::: " + car.toString());

		CarDto dto = CarMapper.INSTANCE.carToCarDto( car );

		System.out.println("dto value ::::::::::::::::::: " + dto.toString());
	}
}
