package com.chainsys.springproject.beans;

public class LunchFactory {
	public Lunch createNonVegSouthIndianLunch() {
		Starters s1 = new Chicken();
		s1.name = "Honey Chicken";
		MainCourse m = new SouthIndian();
		m.name = "Rice";
		Desert d = new Cakes();
		d.name = "Brownie";
		Lunch l = new Lunch(s1,m,d);
		return l;
		
	}
	public Lunch createVegSouthIndianLunch() {
		Starters s1 = new VegRoll();
		s1.name = "CabbagerRoll";
		MainCourse m = new SouthIndian();
		m.name = "Rice";
		Desert d = new IceCream();
		d.name = "Falooda";
		Lunch l = new Lunch(s1,m,d);
		return l;
		
	}
	public Lunch createNorthIndianLunch() {
		Starters s1 = new Soup();
		s1.name = "SweetCorn";
		MainCourse m = new NorthIndian();
		m.name = "Chappatti";
		Desert d = new IceCream();
		d.name = "Rasagulla";
		Lunch l = new Lunch(s1,m,d);
		return l;
		
	}
	public Lunch createChineseIndianLunch() {
		Starters s1 = new VegRoll();
		s1.name = "SpringRoll";
		MainCourse m = new Chinese();
		m.name = "Noodle";
		Desert d = new IceCream();
		d.name = "Snake";
		Lunch l = new Lunch(s1,m,d);
		return l;
	}
}
