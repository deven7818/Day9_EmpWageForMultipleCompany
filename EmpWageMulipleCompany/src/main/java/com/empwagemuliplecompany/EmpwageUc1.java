package com.empwagemuliplecompany;

import java.util.Random;

public class EmpwageUc1 {

	/*
	 *creating method to get attendance 
	 */
	public static int Attendence() {
		Random random = new Random();
		int num = random.nextInt(2);
		return num;
	}

	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation");

		int check = Attendence();
		int isPresent = 1, isAbsent = 2;
		/*
		 * if employee is present print Employee is present
		 */
		if (check == isPresent) {
			System.out.println("Employee is Present");
		}
		/*
		 * else employee is Absent 
		 */
		else {
			System.out.println("Employee is Absent");
		}
	}

}
