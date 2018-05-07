package com.aks.clock.processor;

import com.aks.clock.constants.Constants;
import com.aks.clock.model.Input;

public class LevelThreeProcessor extends AbstractProcessor {

	@Override
	public int process(Input input) {
		return process(input.getThree());
	}

	@Override
	public int multiplier() {
		return 5 * Constants.ONE_MINUTE;
	}

	@Override
	public void validate(int input) {
		if (input < 0 || input > 11) {
			throw new IllegalArgumentException("Please provide level three value between 0-11");
		}
	}

}
