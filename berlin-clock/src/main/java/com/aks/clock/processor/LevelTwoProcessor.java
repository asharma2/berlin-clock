package com.aks.clock.processor;

import com.aks.clock.constants.Constants;
import com.aks.clock.model.Input;

public class LevelTwoProcessor extends AbstractProcessor {

	@Override
	public int process(Input input) {
		return process(input.getTwo());
	}

	@Override
	public int multiplier() {
		return 1 * Constants.ONE_HOUR;
	}

	@Override
	public void validate(int input) {
		if (input < 0 || input > 4) {
			throw new IllegalArgumentException("Please provide level two value between 0-4");
		}
	}

}
