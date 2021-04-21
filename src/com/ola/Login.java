package com.ola;

public class Login {

	//I will give username/password, return me if it is valid or not
	public static boolean validateLogin(long mblno, String password) {
		if(Validate.isValidMobileNumber(mblno) && Validate.isValidePassword(password) ) {
			if (mblno == 8903117739L && password.equals("Pass@1234")) {
				System.out.println("Login successfuly");
				return true;
			} 
			else {
				System.out.println("Mobile number and Password is invalid");
				return false;
			}
		}
		return false;
	}

}
