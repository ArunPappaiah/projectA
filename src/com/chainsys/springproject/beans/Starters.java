package com.chainsys.springproject.beans;

public abstract class Starters {
	public String name;
}
class Chicken extends Starters{
	public Chicken() {
		name = "HoneyChicken";
	}
}
class Soup extends Starters{
	public Soup() {
		name = "SweetCorn";
	}
}
class VegRoll extends Starters{
	public VegRoll() {
		name = "CabbageRoll";
	}
}