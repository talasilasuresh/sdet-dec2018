package com.training.sdet.day2;

public class Car extends Vehicle {
	
	private int doors;
	private int capacity;
	


	public Car(int doors, int capacity, int speed){
		super(speed);
		this.doors = doors;
		this.capacity = capacity;
	}
	
	public void doors(){
		System.out.println("My car has" + this.doors +" doors");
	}
	
	public void fuelCapacity(){
		System.out.println("Car has" + this.capacity+" Its capacity");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("My Car is moving @Speed " + this.getSpeed());
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Car applies break.. ");
	}

}
