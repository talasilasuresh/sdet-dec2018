package com.training.sdet.day1;

class A{
	A(int x){
		super();
	System.out.println("I am A");
	}
	}

class B extends A{
	B(int x){
		super (x);
		System.out.println("Hey I am Class B");
	}
}



public class InheritanceExample {
public static void main(String[] args) {
	B objB = new B(10);
}
}
