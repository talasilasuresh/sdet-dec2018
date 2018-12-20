package com.training.sdet.day2;

public class BankLoanClient {
	public static void main(String[] args) {
		BankLoan bankLoan = new Personal();
	
		bankLoan.foreclosure(true);
		bankLoan.loanamount(3000);
		bankLoan.repay(200);
		System.out.println("---------------");
		
		bankLoan = new MortgageLoan();
		bankLoan.foreclosure(false);
		bankLoan.loanamount(5000);
		bankLoan.repay(500);
		
	}

}
