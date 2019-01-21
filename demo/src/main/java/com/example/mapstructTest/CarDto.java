package com.example.mapstructTest;

import java.util.ArrayList;
import java.util.List;

public class CarDto {
	private List<String> features = new ArrayList<String>();
	private String manufacturer;
	private String make;
	private Integer seatCount;
	private PersonDto driver;
	private String category;
	private EngineDto engine;
	private String price;
	public List<String> getFeatures() {
		return features;
	}
	public void setFeatures(List<String> features) {
		this.features = features;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Integer getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}
	public PersonDto getDriver() {
		return driver;
	}
	public void setDriver(PersonDto driver) {
		this.driver = driver;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public EngineDto getEngine() {
		return engine;
	}
	public void setEngine(EngineDto engine) {
		this.engine = engine;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}