package com.training.sdet.day2;

public class Account implements Comparable<Account> {
       private int accountID;
       private String name;
       private double balance;
       
       private static int count=100;
       
       public Account(String name, double balance) {
    	   super ();
    	   this.accountID = count ++;
    	   this.name = name;
    	   this.balance = balance;
       }

	public int getAccountID() {
		return accountID;
	}

	public String getName() {
		return name;
	}

	public static int getCount() {
		return count;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		//return this.getAccountID() - o.accountID;
		
		return o.getName().compareTo(this.getName());
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return (int) balance;
	}


       
  
	
}
