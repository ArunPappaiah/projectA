package com.chainsys.springproject.beans;

public class Lunch {
	private Starters entree;
	private MainCourse mainFood;
	private Desert sweets;
	// Constructor based dependency injection
	public Lunch(Starters s,MainCourse m,Desert d) {
		System.out.println("Lunch is ready");
		entree = s;
		mainFood = m;
		sweets = d;
	}
	public void serve() {
		System.out.println(entree.name);
		System.out.println(mainFood.name);
		System.out.println(sweets.name);
	}
}
/*
 *Lunch
 * Starters,Chicken,Soup,Vegroll
 * Maincourse,SouthIndian, Chinese
 * Deserts, IceCream, Sweets, Cakes
 */
 