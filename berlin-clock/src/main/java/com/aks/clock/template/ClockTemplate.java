package com.aks.clock.template;

import java.util.Arrays;
import java.util.List;

import com.aks.clock.constants.Constants;
import com.aks.clock.model.Input;
import com.aks.clock.processor.LevelFourProcessor;
import com.aks.clock.processor.LevelOneProcessor;
import com.aks.clock.processor.LevelThreeProcessor;
import com.aks.clock.processor.LevelTwoProcessor;
import com.aks.clock.processor.Processor;
import com.aks.clock.utils.ClockUtils;

public class ClockTemplate {

    private List<Processor> processors = Arrays.asList(new LevelOneProcessor(), new LevelTwoProcessor(),
	    new LevelThreeProcessor(), new LevelFourProcessor());

    public final String calculate(Input input) {
	int output = 0;
	for (Processor processor : processors) {
	    output += processor.process(input);
	}
	if (output > Constants.ONE_DAY)
	    throw new IllegalArgumentException("Please provide the valid input " + input);
	return ClockUtils.convertToHourMinute(output);
    }
}
