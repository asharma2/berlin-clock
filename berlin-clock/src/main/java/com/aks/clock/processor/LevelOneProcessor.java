package com.aks.clock.processor;

import com.aks.clock.constants.Constants;
import com.aks.clock.model.Input;

public class LevelOneProcessor extends AbstractProcessor {

	@Override
	public int process(Input input) {
		return process(input.getOne());
	}

	@Override
	public int multiplier() {
		return 5 * Constants.ONE_HOUR;
	}

	@Override
	public void validate(int input) {
		if (input < 0 || input > 4) {
			throw new IllegalArgumentException("Please provide level one the value between 0-4");
		}
	}

}
