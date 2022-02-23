package com.empwagemuliplecompany;

public class EmpWageUc2 extends EmpwageUc1 {

	/*
	 * calculate daily wage
	 */
	public static int wager() {
		int wagePerHr = 20;
		int workingHrs = 8;
		int dailyWage = wagePerHr * workingHrs;
		return dailyWage;
	}

	public static void main(String[] args) {

		/*
		 * calling attendance method from attendaceUc1 class
		 */
		int attendence = Attendence();
		int isPresent = 1, isAbsent = 0;

		/*
		 * if employee is present then working hours are 8
		 */
		if (attendence == isPresent) {
			System.out.println("Employee's Daily wage is " + wager());
		}
		/*
		 * else employee is absent then working hours are 0
		 */

		else {
			System.out.println("Employee's Daily wage is " + isAbsent);
		}
	}

}
