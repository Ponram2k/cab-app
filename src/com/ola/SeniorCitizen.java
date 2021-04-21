package com.ola;

public class SeniorCitizen {

	/**
	 * To check given person is senior citizen or not
	 * @param age
	 * @return true whether the age is greater than or equla to 60
	 */
	public static boolean isSeniorCitizen(String value) {
		
		if (AgeCalculator.getAge(value) >= 60) {
			return true;
		}
		return false;
	}
}
