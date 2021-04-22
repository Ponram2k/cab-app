package com.ola;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilDateTime {
	/**
	 * To convert given String(yyyy-mm-dd) into date format 
	 * @param value(date)
	 * @return date
	 */
	
	public static LocalDate convertStringToDate(String value)
	{
		LocalDate date = LocalDate.parse(value);
		return date;
	}
	/**
	 * To convert given String(hh:mm:ss) into date format
	 * @param value(time)
	 * @return time
	 */
	public static LocalTime convertStringToTime(String value) {
		value = value + ":00";
		LocalTime time = LocalTime.parse(value);
		return time;
	}
}
