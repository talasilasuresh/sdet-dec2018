package com.training.sdet.day2;

public class Vehicle {
	private int speed;
	public Vehicle(int speed){
		//other jobs can be written here
		this.speed = speed;
	}
	public void move(){
		System.out.println("vehicle is moving" );
			}
	public void brake(){
		System.out.println("vehicle is stopping...");
	}
	// protected is used so that access is given for this class and for child
	protected int getSpeed() {
		return speed;
	}
	

}
