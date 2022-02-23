package com.empwagemuliplecompany;

import java.util.Random;

public class SwitchCaseUc4 extends PartTimeUc3 {

	public static final int isFullTime = 1, isPartTime = 2;

	/*
	 * Generating Random number for 3 possibilities
	 */
	public static int SwitchCase() {
		Random random = new Random();
		int num = random.nextInt(3);
		return num;
	}

	public static void main(String[] args) {

		int check = SwitchCase();

		switch (check) {

		case isFullTime: // full time wage

			System.out.println("Employee Full day Wager = " + wager());
			break;

		case isPartTime: // part time wage

			System.out.println("Employee Part time Wager = " + partTimeWage());
			break;

		default:
			System.out.println("Employee is Absent"); // Absent
		}
	}

}
