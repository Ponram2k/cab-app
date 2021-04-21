package com.ola;

import java.time.LocalDate;

public class AgeCalculator {
	/**
	 * To find the age
	 * @param value(date of birth)
	 * @return age
	 */
	public static int getAge(String value) {
		LocalDate current = LocalDate.now();
		int currentYear = current.getYear();
		LocalDate dob = LocalDate.parse(value);
		int dobYear = dob.getYear();
		return currentYear - dobYear;
	}
}
