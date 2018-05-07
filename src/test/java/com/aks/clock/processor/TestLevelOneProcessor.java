package com.aks.clock.processor;

import org.junit.Assert;
import org.junit.Test;

import com.aks.clock.utils.ClockUtils;

public class TestLevelOneProcessor {

    LevelOneProcessor lop = new LevelOneProcessor();

    @Test
    public void validInput() throws Exception {
	int out = lop.process(ClockUtils.convert("1"));
	Assert.assertEquals(300, out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidInput() throws Exception {
	int out = lop.process(ClockUtils.convert("10"));
	Assert.assertEquals(300, out);
    }

}
