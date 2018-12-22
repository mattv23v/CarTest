package com.qfree.cartest.components;

import com.qfree.cartest.actions.CarCommands;

public class Engine extends BaseComponent {

	CarCommands command;

	@Override
	public void accept(CarCommands command) {

		this.command = command;
		switch (command) {
		case TURN_ON:
			if (isStarted() == true) {
				System.out.println("Engine already running!");
			} else {
				System.out.println("Engine running");
				start();
			}
			break;
		case TURN_OFF:
			if (isStarted() == false) {
				System.out.println("Engine already off!");
			} else {
				System.out.println("Engine off");
				stop();
				break;
			}
		}
	}

}
