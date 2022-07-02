package com.chainsys.springproject.beans;

public class Car {
	public Engine petrolEngine;
	public Wheel alloy;
	public Car() {
		System.out.println("Car object Created "+hashCode());
	}
	public Engine getPetrolEngine() {
		return petrolEngine;
	}
	public void setPetrolEngine(Engine petrolEngine) {
		this.petrolEngine = petrolEngine;
	}
	public Wheel getAlloy() {
		return alloy;
	}
	public void setAlloy(Wheel alloy) {
		this.alloy = alloy;
	}
	public Car(Engine petrolEngine,Wheel alloy) {
		System.out.println("Car object Created"+hashCode());
		this.petrolEngine = petrolEngine;
		this.alloy = alloy;
	}
	public void start() {
		petrolEngine.start();
	}
	public void move() {
		alloy.rotate();
	}
}
