package sample_of_inheritance;

public class CruiseShip extends Ship{
	protected int passenger;
	
	public CruiseShip(String name, String yearBuilt, int p)
	{
		super(name,yearBuilt);
		passenger=p;
	}
	
	void setPassengers(int p)
	{
		this.passenger=p;
	}
	
	int getPassengers()
	{
		return passenger;
	}
	
	public String toString()
	{
		return super.toString()+"\t\tPassengers :"+getPassengers()+"\n";
	}
}
