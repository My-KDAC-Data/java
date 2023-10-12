package com.add.fruits;

public class Mango extends Fruit {
	
    public Mango()
    {
		
    }
	
	
	public Mango(String color, double weight, String name, boolean isFresh)
	{
		super(color, weight, name, isFresh);
		
	}

	@Override
	public String taste()
	{	
		return "sweet";
	}
	
	public boolean equals(String taste)
	{
		boolean result=false;
		if(this.taste()==taste)
		return true;
		return false;
	}

}
