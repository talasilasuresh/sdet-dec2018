package com.training.sdet.day1;

public class Account {
 
	private int accId;
	private double accBalance;
	private Name Name;
	
	public Account() {
		super();		
	}
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
	//	if (accBalance < 1000){
		//	this.accBalance = 0;
			
		this.accBalance = accBalance;
		//}
	}

	public Name getName() {
		return Name;
	}

	public void setName(Name name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accBalance=" + accBalance + ", Name=" + Name + "]";
	}

/*//	public String toString() {
//		return this.getAccId() +", " + this.getAccBalance() + ", " + this.getName();
//	}
*/	

	
 }

