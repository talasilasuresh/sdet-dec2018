package com.training.sdet.day1;


public class AccountImp1 {
	 public static void main(String[] args) {
		 Account harryAccount ;
		 
		 //its in heap
		 harryAccount = new Account();
		 
		 harryAccount.setAccId(101);
		 harryAccount.setAccBalance(3000);
		 
		 Name name = new Name();
		 name.setFirstName("harry");
		 name.setLastName("peter");
		 harryAccount.setName(name);
		 
		 System.out.println(harryAccount.toString());
		// System.out.println("Acc ID : " + harryAccount.getAccId());
		// System.out.println("First Name :" + harryAccount.getName().getFirstName());
		// System.out.println("Last Name :" + harryAccount.getName().getLastName());
		// System.out.println("Acc Balance : " + harryAccount.getAccBalance());
	 }

}
