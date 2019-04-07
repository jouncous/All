package sample_of_inheritance;

public class Ship {
	protected String name;
	protected String yearBuilt;
	
	public Ship(String name, String yearBuilt)
	{
		setName(name);
		setYearBuilt(yearBuilt);
	}
	
	void setName(String n)
	{
		name=n;
	}
	
	void setYearBuilt(String y)
	{
		yearBuilt=y;
	}
	
	String getName()
	{
		return name;
	}
	
	String getYearBuilt()
	{
		return yearBuilt;
	}
	
	public String toString()
	{
		return "Name :"+getName()+"\tYearBuilt :"+getYearBuilt(); 
	}
}
