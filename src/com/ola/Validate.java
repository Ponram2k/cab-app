package com.ola;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	/**
	 * Validate the mobile number
	 * @param no
	 * @return true when length of the mobile number is 10 digit
	 */
	public static boolean isValidMobileNumber(long no) {
		String check = Long.toString(no);
		if(check.length() == 10) {
			return true;
		}
		return false;
	}
	
	/**
	 * Validate the password would contain,
	 * minimum of 8 character
	 * Small and capital Alphabets
	 * Some numerical
	 * And some special character 
	 * @param password
	 * @return boolean value
	 */
	public static boolean isValidePassword(String password) {
		String check = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%])(?=\\S+$).{8,20}$";
		if (password == null) {
            return false;
        }
		Pattern p = Pattern.compile(check);
		Matcher m = p.matcher(password);
        return m.matches();
	}
}

