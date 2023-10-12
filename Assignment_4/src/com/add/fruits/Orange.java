package com.add.fruits;

public class Orange extends Fruit {
	
	
	public Orange()
	{
		super();
	}

	public Orange(String color, double weight, String name, boolean isFresh) 
	{
		super(color, weight, name, isFresh);
		
	}

	@Override
	public String taste() 
	{
		return "sour";
	}
	
	public boolean equals(String taste)
	{
		boolean result=false;
		if(this.taste()==taste)
		return true;
		return false;
	}

}
