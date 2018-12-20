package com.training.sdet.day2;

public class LoanClient {
	public static void main(String[] args) {
	Loan loan = new HomeLoan(12000);
	
	showLoan(loan);
	
		  
	loan = new VehicleLoan(10000);
	
	showLoan(loan);
	
	loan = new EducationLoan(5000);
	
	}

	private static void showLoan(Loan loan) {
		System.out.println("Name" +loan.getName());
		System.out.println("Name" +loan.getAddress());
		System.out.println("ROI" +loan.getROI());
	}
}


