package com.aks.clock.template;

import org.junit.Assert;
import org.junit.Test;

import com.aks.clock.model.Input;
import com.aks.clock.utils.ClockUtils;

public class TestClockTemplate {

	ClockTemplate template = new ClockTemplate();

	@Test
	public void validInput() throws Exception {
		Input input = ClockUtils.convert("1", "2", "3", "4");
		String out = template.calculate(input);
		Assert.assertEquals("7h 19m", out);
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidInput() throws Exception {
		Input input = ClockUtils.convert("1", "2", "3", "21");
		template.calculate(input);
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidInput2() throws Exception {
		Input input = ClockUtils.convert("4", "4", "11", "4");
		template.calculate(input);
	}
}
