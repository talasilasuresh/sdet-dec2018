package com.training.sdet.day2;

public class Truck extends Vehicle{
	private int noOfPounds;
	
	public Truck(int noOfPounds, int speed){
		super(speed);
		this.noOfPounds = noOfPounds;
	}
	public void load(int noOfPounds){
				System.out.println("Truck has" + noOfPounds + " load");
	}
	
	public void load(){
		System.out.println("Truck has " + noOfPounds + " load");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Truck move @ speed");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Truck applies break");
	}

	@Override
	protected int getSpeed() {
		// TODO Auto-generated method stub
		return super.getSpeed();
	}

}
 