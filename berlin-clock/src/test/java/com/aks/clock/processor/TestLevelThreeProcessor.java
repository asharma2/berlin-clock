package com.aks.clock.processor;

import org.junit.Assert;
import org.junit.Test;

import com.aks.clock.utils.ClockUtils;

public class TestLevelThreeProcessor {

    LevelFourProcessor lop = new LevelFourProcessor();

    @Test
    public void validInput() throws Exception {
	int out = lop.process(ClockUtils.convert("1", "2", "3", "4"));
	Assert.assertEquals(4, out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidInput() throws Exception {
	int out = lop.process(ClockUtils.convert("1", "1", "12", "14"));
	Assert.assertEquals(4, out);
    }

}
