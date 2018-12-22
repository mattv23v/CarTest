package com.qfree.cartest.components;

import com.qfree.cartest.actions.CarCommands;

public class Stereo extends BaseComponent {

	CarCommands command;

	@Override
	public void accept(CarCommands command) {

		this.command = command;
		switch (command) {
		case TURN_ON:
			if (isStarted() == true) {
				System.out.println("Stereo already On!");
			} else {
				System.out.println("Stereo On");
				start();
			}
			break;
		case TURN_OFF:
			if (isStarted() == false) {
				System.out.println("Stereo already Off!");
			} else {
				System.out.println("Stereo Off");
				stop();
				break;
			}
		}
	}

}
