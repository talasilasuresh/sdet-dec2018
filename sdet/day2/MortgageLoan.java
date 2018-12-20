package com.training.sdet.day2;

public class MortgageLoan implements BankLoan {

	@Override
	public void loanamount(int amount) {
		System.out.println("mortgage loan" + amount);
		
	}

	@Override
	public void repay(int repayAmount) {
		System.out.println("repay" + repayAmount);
		
	}

	@Override
	public void foreclosure(boolean flag) {
		System.out.println(" 3% foreclosure" + flag);
		
	}

}
