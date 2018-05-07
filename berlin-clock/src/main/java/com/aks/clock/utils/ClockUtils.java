package com.aks.clock.utils;

import com.aks.clock.constants.Constants;
import com.aks.clock.model.Input;

public final class ClockUtils {

	private ClockUtils() {
	}

	public static final Input convert(String... args) {
		if (args.length > 4)
			throw new IllegalArgumentException("Only four values can be given as input");
		Input input = new Input();
		if (args.length == 1) {
			input.setOne(Integer.parseInt(args[0]));
		} else if (args.length == 2) {
			input.setOne(Integer.parseInt(args[0]));
			input.setTwo(Integer.parseInt(args[1]));
		} else if (args.length == 3) {
			input.setOne(Integer.parseInt(args[0]));
			input.setTwo(Integer.parseInt(args[1]));
			input.setThree(Integer.parseInt(args[2]));
		} else if (args.length == 4) {
			input.setOne(Integer.parseInt(args[0]));
			input.setTwo(Integer.parseInt(args[1]));
			input.setThree(Integer.parseInt(args[2]));
			input.setFour(Integer.parseInt(args[3]));
		}
		return input;
	}

	public static final String convertToHourMinute(int minute) {
		int hour = minute / Constants.ONE_HOUR;
		return hour + "h " + (minute - hour * Constants.ONE_HOUR) + "m";
	}

}
