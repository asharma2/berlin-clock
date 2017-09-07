package com.aks.clock.processor;

import com.aks.clock.constants.Constants;
import com.aks.clock.model.Input;

public class LevelFourProcessor extends AbstractProcessor {

    @Override
    public int process(Input input) {
	return process(input.getFour());
    }

    @Override
    public int multiplier() {
	return 1 * Constants.ONE_MINUTE;
    }

    @Override
    public void validate(int input) {
	if (input < 0 || input > 4) {
	    throw new IllegalArgumentException("Please provide level four value between 0-4");
	}
    }

}
