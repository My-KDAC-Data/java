package com.add.fruits;

public class Apple extends Fruit {
	
	
	public Apple()
	{
		super();
	}

	public Apple(String color, double weight, String name, boolean isFresh)
	{
		super(color, weight, name, isFresh);
	
	}

	@Override
	public String taste()
	{	
		return "sweet n sour";
	}
	
	public boolean equals(String taste)
	{
		boolean result=false;
		if(this.taste()==taste)
		return true;
		return false;
	}

}
