package sample_of_inheritance;

public class CargoShip extends Ship{
	protected int tonnage;
	
	CargoShip(String name,String yearBuilt,int t)
	{
		super(name,yearBuilt);
		tonnage=t;
	}
	
	void setTonnage(int t)
	{
		this .tonnage=t;
	}
	
	int getTonnage()
	{
		return tonnage;
	}
	
	public String toString()
	{
		return super.toString()+"\t\tTonnage :"+getTonnage()+"\n";
	}
}
