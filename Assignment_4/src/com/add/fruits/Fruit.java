package com.add.fruits;

public class Fruit {
	
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	
	public Fruit()
	{
		
	}
	
	public Fruit(String  name, double weight, String color, boolean isFresh) 
	{
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	
	}
	
	public String taste()
	{
		return "No specific taste..";
	}
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}

	public boolean isFresh()
	{
		return isFresh;
	}
	
	

	public void setFresh(boolean isFresh2) 
	{
		this.isFresh = isFresh;
		
		
	}

	
	
}	
	






		
	




