package com.aks.clock.processor;

import org.junit.Assert;
import org.junit.Test;

public class TestBerlinClock {

    @Test
    public void check_23_59_00() throws Exception {
	BerlinClock bc = new BerlinClock();
	String actual = bc.berlinDisplay("23:59:00");
	String expected = "Y\nRRRR\nRRR0\nYYRYYRYYRYY\nYYYY";
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_20_00_00() throws Exception {
	BerlinClock bc = new BerlinClock();
	String actual = bc.berlinDisplay("20:00:00");
	String expected = "Y\nRRRR\n0000\n00000000000\n0000";
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_21_01_01() throws Exception {
	BerlinClock bc = new BerlinClock();
	String actual = bc.berlinDisplay("21:01:01");
	String expected = "0\nRRRR\nR000\n00000000000\nY000";
	Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void check_invalid_input() throws Exception {
	BerlinClock bc = new BerlinClock();
	bc.berlinDisplay("2x:00:00");
    }

}
