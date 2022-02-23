package com.empwagemuliplecompany;

/**
 * Refactoring the EmployeeWage for multiple Company using seperate object for
 * each company to calculate employee wage.
 */

public class EmpWageMultipleCompany {

	private static final int isFullTime = 1;
	private static final int isPartTime = 2;
	private static final int isAbsent = 0;

	private String companyName;
	private int maxWorkingHrs;
	private int daysInMonth;
	private int wagePerHr;

	EmpWageMultipleCompany(String companyName, int maxWorkingHrs, int daysInMonth, int wagePerHr) {
		this.companyName = companyName;
		this.maxWorkingHrs = maxWorkingHrs;
		this.daysInMonth = daysInMonth;
		this.wagePerHr = wagePerHr;
	}

	public static void main(String[] args) {

		EmpWageMultipleCompany e1 = new EmpWageMultipleCompany("Dmart", 100, 20, 100);
		EmpWageMultipleCompany e2 = new EmpWageMultipleCompany("JioMart", 120, 25, 80);
		e1.employeewage();
		e2.employeewage();
	}

	void employeewage() {
		int workingHr = 0;
		int totalWorkingHr = 0;
		int monthlyTotalWage = 0;
		int dailyWagArray[] = new int[daysInMonth];
		int days = 0;

		while (days < daysInMonth && totalWorkingHr < maxWorkingHrs) {
			int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
			switch (empCheck) {
			case isFullTime:
				workingHr = 8;

			case isPartTime:
				workingHr = 4;

			case isAbsent:
				workingHr = 0;

			}
			totalWorkingHr += workingHr;
			dailyWagArray[days] = workingHr * wagePerHr;
			days++;
		}
		for (int j = 0; j < daysInMonth; j++) {
			int day = j + 1;
			System.out.println("Day " + day + " wage is " + dailyWagArray[j]);
			monthlyTotalWage = monthlyTotalWage + dailyWagArray[j];
		}
		System.out.println("Monthly wage for " + companyName + " : " + monthlyTotalWage + "\n");
	}
}
