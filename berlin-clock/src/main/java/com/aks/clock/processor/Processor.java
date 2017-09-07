package com.aks.clock.processor;

import com.aks.clock.model.Input;

public interface Processor {

	int process(Input input);

	int multiplier();

	void validate(int input);
}
