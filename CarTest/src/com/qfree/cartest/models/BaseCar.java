package com.qfree.cartest.models;

import java.util.ArrayList;
import java.util.List;

import com.qfree.cartest.actions.CarCommands;
import com.qfree.cartest.components.IComponent;

public abstract class BaseCar implements ICar {

	private List<IComponent> components = new ArrayList<>();
	private boolean started;

	protected BaseCar(IComponent... components) {
		// TODO: build components of the car
		for (IComponent comp : components) {
			this.components.add(comp);
		}
	}

	@Override
	public boolean start() {
		// TODO: turn on all components
		if (started == false) {
			System.out.println("Started car " + getCarYear() + " " + getCarMake() + " " + getCarModel());
			for (IComponent comp : components) {
				comp.accept(CarCommands.TURN_ON);
			}
			started = true;
			return true;
		} else {
			System.out.println(getCarYear() + " " + getCarMake() + " " + getCarModel() + " Already Started!");
			return false;
		}
	}

	@Override
	public boolean turnOff() {
		// TODO: turn off all components
		if (started == true) {
			System.out.println("Stopped car " + getCarYear() + " " + getCarMake() + " " + getCarModel());
			for (IComponent comp : components) {
				comp.accept(CarCommands.TURN_OFF);
			}
			started = false;
			return true;
		} else {
			System.out.println(getCarYear() + " " + getCarMake() + " " + getCarModel() + " Already Off!");
			return false;
		}
	}
}
