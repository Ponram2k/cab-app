package com.ola;

public class CabType {
	
	static String[] cabType = { "Micro", "Mini", "Prime" };
	static int[] prizePerKm = { 10, 15, 20 };
	/**
	 * Display the type's of cab and there prize details 
	 * @return selected cab index
	 */
	public static int selectCab() {
		System.out.println("Car Types:");
		for (int i = 0; i < cabType.length; i++) {
			System.out.println(i + 1 + " " + cabType[i] + " " + prizePerKm[i]);
		}
		int choice = 1;
		System.out.println("Select type:"+choice);
		return choice-1;
	}
}
