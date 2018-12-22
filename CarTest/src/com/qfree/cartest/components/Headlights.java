package com.qfree.cartest.components;

import com.qfree.cartest.actions.CarCommands;

public class Headlights extends BaseComponent {
	
	CarCommands command;

	@Override
	public void accept(CarCommands command) {

		this.command = command;
		switch (command) {
		case TURN_ON:
			if (isStarted() == true) {
				System.out.println("Headlights already On!");
			} else {
				System.out.println("Headlights On");
				start();
			}
			break;
		case TURN_OFF:
			if (isStarted() == false) {
				System.out.println("Headlights already Off!");
			} else {
				System.out.println("Headlights Off");
				stop();
				break;
			}
		}
	}

}
