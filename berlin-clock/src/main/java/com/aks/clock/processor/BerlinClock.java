package com.aks.clock.processor;

import java.util.Collections;

import com.aks.clock.utils.RegexUtils;

public class BerlinClock {

    public static final String YELLOW = "Y";
    public static final String RED = "R";
    public static final String NO_DISPLAY = "0";

    public String berlinDisplay(String time) {
	return process(RegexUtils.readTime(time));
    }

    private String process(int[] time) {
	StringBuilder berlinClock = new StringBuilder();
	berlinClock.append(berlinSeconds(time[2])).append(System.lineSeparator());
	berlinClock.append(berlineTopHours(time[0])).append(System.lineSeparator());
	berlinClock.append(berlineBottomHours(time[0])).append(System.lineSeparator());
	berlinClock.append(berlineTopMinute(time[1]).replaceAll("YYY", "YYR")).append(System.lineSeparator());
	berlinClock.append(berlineBottomMinute(time[1]));
	return berlinClock.toString();
    }

    private String berlineBottomMinute(int minute) {
	return berlinClockFormat(minute % 5, 4, YELLOW);
    }

    private String berlineTopMinute(int minute) {
	return berlinClockFormat(minute / 5, 11, YELLOW);
    }

    private String berlinSeconds(int seconds) {
	return (seconds % 2 == 0) ? YELLOW : NO_DISPLAY;
    }

    private String berlineTopHours(int hour) {
	return berlinClockFormat(hour / 5, 4, RED);
    }

    private String berlineBottomHours(int hour) {
	return berlinClockFormat(hour % 5, 4, RED);
    }

    private String berlinClockFormat(int mark, int total, String symbol) {
	return String.join("", Collections.nCopies(mark, symbol))
	        + String.join("", Collections.nCopies(total - mark, NO_DISPLAY));
    }
}
