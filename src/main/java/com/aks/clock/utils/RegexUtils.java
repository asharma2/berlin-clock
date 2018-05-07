package com.aks.clock.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegexUtils {

	public static final String REGEX_HHMM_SS = "^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$";

	public static final boolean validInput(String hhmmss) {
		Pattern pattern = Pattern.compile(REGEX_HHMM_SS);
		Matcher matcher = pattern.matcher(hhmmss);
		return matcher.matches();
	}

	public static final int[] readTime(String hhmmss) {
		Pattern pattern = Pattern.compile(REGEX_HHMM_SS);
		Matcher matcher = pattern.matcher(hhmmss);
		if (!matcher.matches())
			throw new IllegalArgumentException("Please provide input in hh:mm:ss format => " + hhmmss);

		int[] time = new int[] { Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)),
				Integer.parseInt(matcher.group(3)) };
		return time;
	}

}
