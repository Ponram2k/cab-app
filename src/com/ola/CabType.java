package com.ola;

public class CabType {
	public static int selectCab(String[] ary1, int[] ary2) {
		System.out.println("Car Types:");
		for (int i = 0; i < ary1.length; i++) {
			System.out.println(i + 1 + " " + ary1[i] + " " + ary2[i]);
		}
		int choice = 1;
		System.out.println("Select type:"+choice);
		return choice-1;
	}
}
