package com.qfree.cartest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.qfree.cartest.components.Engine;
import com.qfree.cartest.components.Headlights;
import com.qfree.cartest.components.Stereo;
import com.qfree.cartest.models.Car;
import com.qfree.cartest.models.ICar;

public class CarTest {

	private final List<ICar> carLot;

	CarTest() {
		carLot = new ArrayList<>();
	}

	public static void main(String args[]) {
		System.out.println("App started!");

		CarTest carTest = new CarTest();
		/**
		 * Step 1:
		 * 
		 * Create two(2) or more car implementations and add those cars to the car lot.
		 * After building out the lot, print the inventory of the lot utilizing Java 8
		 * streams to include all relevant attributes of the vehicles (make/model/year).
		 * At least 1 of the new cars must be model year 2016 or later
		 */

		carTest.buildCarLot();
		// carTest.printLotInventory();

		/**
		 * Step 2:
		 * 
		 * Create a filter predicate to only print out new cars and print those cars
		 */

		// carTest.printNewCars((x) -> Integer.valueOf(x.getCarYear())>=2016);
		/**
		 * Step 3:
		 * 
		 * - Create Engine / Headlights / Stereo components - Modify the vehicle
		 * creation to pass in instances of each component for each car - Finish
		 * building out the turn-on/turn-off function to send a command to each
		 * component and print out a message indicating each component has turned on or
		 * off e.x. "Engine has started" - Make sure to add error and exception handling
		 * if attempting to start a vehicle that's already started or stop one that's
		 * already stopped. - Invoke the turn on and turn off method for each car in the
		 * lot, printing all status to the console
		 */

		carTest.startAllCars();
		carTest.stopAllCars();

	}

	void buildCarLot() {
		// TODO: build car lot \
		ICar carOne = new Car("Ford", "Taurus", "1995", new Engine(), new Headlights(), new Stereo());
		ICar carTwo = new Car("DeLorean", "DMC-12", "1981", new Engine(), new Headlights(), new Stereo());
		ICar carThree = new Car("Honda", "CRV", "2017", new Engine(), new Headlights(), new Stereo());
		ICar carFour = new Car("Toyoda", "Camry", "2016", new Engine(), new Headlights(), new Stereo());
		carLot.add(carOne);
		carLot.add(carTwo);
		carLot.add(carThree);
		carLot.add(carFour);
	}

	void printLotInventory() {
		// TODO: print lot inventory
		carLot.stream().forEach(
				ICar -> System.out.println(ICar.getCarMake() + " " + ICar.getCarModel() + " " + ICar.getCarYear()));
	}

	void printNewCars(Predicate<ICar> predicate) {
		// TODO: print only cars with model years 2016 and newer
		carLot.stream().filter(predicate).forEach(
				ICar -> System.out.println(ICar.getCarMake() + " " + ICar.getCarModel() + " " + ICar.getCarYear()));
	}

	void startAllCars() {
		// TODO: start all the cars in the lot
		for (ICar curCar : carLot) {
			curCar.start();
		}
	}

	void stopAllCars() {
		// TODO: turn off all cars in the lot
		for (ICar curCar : carLot) {
			curCar.turnOff();
		}
	}

}
