package com.training.businesslogic;

public class MyBusinessLogic {
	
	public int insertRecord(int empId, String empName){
		
		System.out.println("Inserting EmpId" + empId + ", Name " + empName);
	
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return 1;
	}
	
	
	public String sayHello(String name) {
		if (1==1){
		throw new RuntimeException("hey iam custom exception");
		}
		return "Hello " + name;
		
	}

}
