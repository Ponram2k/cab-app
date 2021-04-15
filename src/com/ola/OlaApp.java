package com.ola;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class OlaApp {
	String[] cabType = { "Micro", "Mini", "Prime" };
	int[] prizePerKm = { 10, 15, 20 };

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		long mobileNo = 0;
		String password = null;
		OlaApp login = new OlaApp();
		System.out.print("Mobile No:");
		mobileNo = value.nextLong();
		System.out.print("Password:");
		password = value.next();
		login.logIn(mobileNo, password);
	}
	/**
	 * To verify the user
	 * @param mblno
	 * @param password
	 */
	public void logIn(long mblno, String password) {
		if (mblno == 8903117739L && password.equals("pass1234")) {
			System.out.println("Login successfuly");
			carTypes();
		} else {
			System.out.println("Mobile number and Password is invalid");
		}
	}

	/**
	 * To Display the car types and select them
	 */
	public void carTypes() {
		Scanner select = new Scanner(System.in);
		System.out.println("Car Types:");
		for (int i = 0; i < cabType.length; i++) {
			System.out.println(i + 1 + "." + cabType[i] + "(Rs:" + prizePerKm[i] + "/km)");
		}
		System.out.print("Select type:");
		int type = select.nextInt();
		type = type - 1;
		prizeEstimator(type);
	}

	/**
	 * To estimate the prize
	 * @param type
	 */
	public void prizeEstimator(int type) {
		int km = 10 ,choice;
		float gst, totalAmount, amount;
		Scanner prize = new Scanner(System.in);
		System.out.println("Cab type:"+cabType[type]);
		System.out.println("No.of km:"+km);
		amount = km * prizePerKm[type];
		amount = peekTime(amount);
		System.out.println("Are you senior citizen(1.yes, 2.no)");
		choice = prize.nextInt();
		if(choice == 1)
		{
			amount = seniorCitizen(amount);
		}
		System.out.println("Your total bill amount is Rs:"+amount);
		gst = (float) (amount * 0.07);
		totalAmount = amount + gst;
		System.out.println("Your total bill amount with gst Rs:"+totalAmount);
	}
	
	/**
	 * To peek time calculation
	 * @param type
	 * @param totalAmount
	 */
	public float peekTime(float amount){
		String time;
		Scanner book = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		System.out.println("Enter the time you want cab(hh:mm):");
		time = book.next();
		time = time + ":00";
		LocalTime pickupTime = LocalTime.parse(time);
		int check = pickupTime.getHour();
		
		if(check>=17 && check<=19) {
			amount = (float) ((float)amount + (amount * 0.0125));
			return amount;
		}
		return amount;
	}
	
	/**
	 * To reduce amount for senior citizen
	 * @param amount
	 * @return
	 */
	public float seniorCitizen(float amount) {
		Scanner dob = new Scanner(System.in);
		String date ;
		int age;
		LocalDate current = LocalDate.now();
		int currentYear = current.getYear();
		System.out.println("Enter Date of birth(yyyy-mm-dd):");
		date = dob.next();
		LocalDate seniordob = LocalDate.parse(date);
		int seniorYear = seniordob.getYear();
		age = currentYear - seniorYear;
		if(age >= 60) {
			amount = amount / 2;
			return amount;
		}
		return amount;
	}
}
