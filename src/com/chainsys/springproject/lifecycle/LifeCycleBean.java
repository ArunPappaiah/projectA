package com.chainsys.springproject.lifecycle;

public class LifeCycleBean {
	public void print() {
		System.out.println("Print Called");
	}
	LifeCycleBean(){
		System.out.println("Life cycle object Created");
	}
	public void setUp() {
		System.out.println("Starting...");
	}
	public void close() {
		System.out.println("Closing...");
	}
}
