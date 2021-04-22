package com.ola;

public class User {

	/**
	 * To check given person is senior citizen or not
	 * @param age
	 * @return true whether the age is greater than or equal to 60
	 */
	public static boolean isSeniorCitizen(String value) {
		
		if (AgeCalculator.getAge(value) >= 60) {
			return true;
		}
		return false;
	}
}
