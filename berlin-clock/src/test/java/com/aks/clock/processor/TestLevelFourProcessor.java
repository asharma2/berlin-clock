package com.aks.clock.processor;

import org.junit.Assert;
import org.junit.Test;

import com.aks.clock.utils.ClockUtils;

public class TestLevelFourProcessor {

    LevelThreeProcessor lop = new LevelThreeProcessor();

    @Test
    public void validInput() throws Exception {
	int out = lop.process(ClockUtils.convert("1", "2", "3"));
	Assert.assertEquals(15, out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidInput() throws Exception {
	int out = lop.process(ClockUtils.convert("1", "1", "12"));
	Assert.assertEquals(300, out);
    }

}
