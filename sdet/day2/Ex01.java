package com.training.sdet.day2;

public class Ex01 {
    public static void main(String[] args) {
		try {
			try{
    	int arr[] = new int[-5];
		}catch(NegativeArraySizeException nase){
			System.out.println(nase);
		}	
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
				
		int res = num1 / num2;
		System.out.println("res   :"  + res);
		
		}catch(ArithmeticException ae){
			System.out.println("Division problem :"  + ae);
		}catch(NumberFormatException ae){
			System.out.println("Pass integer :"  + ae);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("I am from finally");
		}
		
		System.out.println("some other logic .....");
	}
}
 