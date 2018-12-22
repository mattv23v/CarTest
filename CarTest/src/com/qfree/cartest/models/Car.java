package com.qfree.cartest.models;

import com.qfree.cartest.components.IComponent;

public class Car extends BaseCar {

	private String make;
	private String model;
	private String year;

	public Car(String make, String model, String year, IComponent engine, IComponent headlights, IComponent stereo) {
		super(engine, headlights, stereo);
		this.make = make;
		this.model = model;
		this.year = year;
	}

	@Override
	public String getCarMake() {
		return make;
	}

	@Override
	public String getCarModel() {
		return model;
	}

	@Override
	public String getCarYear() {
		return year;
	}

}
