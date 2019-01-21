package com.example.mapstructTest;

import org.mapstruct.factory.Mappers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );
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
