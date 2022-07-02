package com.chainsys.springproject.beans;

public abstract class Desert {
	public String name;
}
class IceCream extends Desert{
	public IceCream() {
		name = "Chocolate";
	}
}
class Sweets extends Desert{
	public Sweets() {
		name = "Rasagulla";
	}
}
class Cakes extends Desert{
	public Cakes() {
		name = "RussianVelvet";
	}
	public Cakes(String name) {
		this.name = name;
	}
}
