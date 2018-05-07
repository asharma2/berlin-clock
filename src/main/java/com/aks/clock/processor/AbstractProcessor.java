package com.aks.clock.processor;

public abstract class AbstractProcessor implements Processor {

	protected final int process(int input) {
		validate(input);
		return input * multiplier();
	}
}
