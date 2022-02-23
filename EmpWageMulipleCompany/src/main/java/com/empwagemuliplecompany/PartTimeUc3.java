package com.empwagemuliplecompany;

import java.util.Random;

public class PartTimeUc3 extends EmpWageUc2 {
	//Adding Part Time Employee
	
		public static int Attendece() {	
			Random random = new Random();
			int num = random.nextInt(3);
			return num;
		}
		
	/*
	 * calculate daily wage
	 */
	public static int partTimeWage() {
		//Adding PartTime Wage
		int wagePerHr = 20, partTimrHr = 4;
		int partTimeWage =  wagePerHr * partTimrHr;
		return partTimeWage;
	}
	public static void main(String[] args) {
		

		int isPresent = 1, isPartTime = 2, isAbsent = 0;
		
		int attendence = Attendece();
		int dailyWage = wager();
		
		/*
		 * if employee is present fullTime then working hours are 8
		 */
		if(attendence == isPresent) {
			System.out.println("Employee full Day wage " +dailyWage);
		}
		/*
		 * else if employee is present PartTime then working hours are 4
		 */
		else if(attendence == isPartTime) {
			System.out.println("Employee PartTime Wage " + partTimeWage());		
		}
		
		/*
		 * else Employee is absent
		 */ 
		else {
			System.out.println("Employee is Absent " +isAbsent );
		}
		

	}

}
