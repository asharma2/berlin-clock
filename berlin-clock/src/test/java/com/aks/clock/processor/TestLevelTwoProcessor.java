package com.aks.clock.processor;

import org.junit.Assert;
import org.junit.Test;

import com.aks.clock.utils.ClockUtils;

public class TestLevelTwoProcessor {

    LevelTwoProcessor lop = new LevelTwoProcessor();

    @Test
    public void validInput() throws Exception {
	int out = lop.process(ClockUtils.convert("1", "2"));
	Assert.assertEquals(120, out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidInput() throws Exception {
	int out = lop.process(ClockUtils.convert("10", "10"));
	Assert.assertEquals(120, out);
    }

}
