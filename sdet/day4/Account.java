package com.training.sdet.day4;

public class Account {
	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
		if (amount < balance) {
			System.out.println("Amount Withdraw of " + amount + " by " + Thread.currentThread().getName());

			try { // simulating for external resource
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			balance = balance - amount;
			System.out.println("Remaining balance " + "after withdraw " + balance);
		} else {
			System.out.println("Sorry Mr : " + Thread.currentThread().getName() + " you dont have balance");
		}
	}

}
