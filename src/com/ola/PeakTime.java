package com.ola;

import java.time.LocalTime;

public class PeakTime {
	/**
	 * To check peak time amount
	 * @param time
	 * @return true whether the given time is peak time
	 */
	public static boolean getPeakTime(String time) {
		LocalTime pekTym = GetDateAndTime.convertStringToTime(time);
		int check = pekTym.getHour();
		if (check >= 17 && check <= 19) {
			return true;
		}
		return false;
	}
}
