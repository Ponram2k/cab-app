package com.ola;

import java.time.LocalDate;
import java.util.Scanner;

public class OlaApp {
	
	public static void main(String[] args) {
		int type = 0;
		Scanner value = new Scanner(System.in);
		System.out.println("=============================OLA Cab=============================");
		boolean val = false;
		long mobileNo = 0;
		String password = null;
		OlaApp ola = new OlaApp();
		System.out.print("Mobile No:");
		mobileNo = value.nextLong();
		System.out.print("Password:");
		password = value.next();
		val = ola.logIn(mobileNo, password);
		if(val) {
			type = ola.carTypes();
			ola.prizeEstimator(type);
		}
		value.close();
	}

	/**
	 * To verify the user
	 * @param mblno
	 * @param password
	 * @return true when the both mobile and password are correct
	 */
	public boolean logIn(long mblno, String password) {
		return Login.validateLogin(mblno, password);
	}

	
	/**
	 * To Display the car types and select them
	 */
	public int carTypes() {
		System.out.println("choice Type Amount/km");
		return CabType.selectCab();
	}

	/**
	 * To estimate the prize
	 * 
	 * @param type
	 */
	public void prizeEstimator(int type) {
		int km = 10;
		float amount;
		String dob = "1960-05-19";		
		String bookTime = "18:35";
		System.out.println("Cab type:" + CabType.cabType[type]);
		System.out.println("No.of km:" + km);
		System.out.println("Date you book cab(YYYY-MM-DD):"+LocalDate.now());
		System.out.println("Time you want cab(hh:mm):"+bookTime);
		System.out.println("Date of birth(YYYY-MM-DD):"+dob);
		amount = km * CabType.prizePerKm[type];
		System.out.println("Your bill amount is Rs:" + amount);
		if(PeakTime.getPeakTime(bookTime)) {
			System.out.println("You book cab at peak time so 1.25% additionaly add to your bill amount");
			amount = (float) ((float) amount + (amount * 0.0125));
			System.out.println("Your bill amount after adding 1.25%:"+amount);
		}
		if(User.isSeniorCitizen(dob)) {
			System.out.println("You are senior citizen you have 50% discount form total bill amount");
			amount = amount / 2;
			System.out.println("Your bill amount after reducing 50%:"+amount);
		}
		amount = amount +  GstCalculation.getGstValue(amount);
		System.out.println("Your bill amount with 7% gst Rs:" + amount );
	}

}
