package com.training.sdet.day2;

public abstract class Loan {
	private int loanAmount;
	
	public Loan(int loanAmount){
		this.loanAmount = loanAmount;
	}
	
	public String getName(){
		return "Peter";
	}
	
	public String getAddress(){
		return "American Dreamway, Reston";
	}
	
	//<access specifier> ,access modifier>, <return type/void> method(args)
	//public private
	// abstract final static synchronize
	public abstract double getROI();
	
}
