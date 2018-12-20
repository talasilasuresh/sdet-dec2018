package com.training.sdet.day2;

public class Personal implements BankLoan{

	@Override
	public void loanamount(int amount) {
		System.out.println("personal loan" + amount);
		
	}

	@Override
	public void repay(int repayAmount) {
		System.out.println("personal repay" + repayAmount);
		
	}

	@Override
	public void foreclosure(boolean flag) {
		System.out.println(" 2% on forclosure" + flag);
		
	}

}
