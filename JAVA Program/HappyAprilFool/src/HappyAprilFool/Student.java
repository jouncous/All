package HappyAprilFool;
public class Student {
	protected String name;
	protected int id;
	protected double marks;
	
	public Student(String name, int id, double marks)
	{
		SetMethod(name,id,marks);
	}
	
	public void SetMethod(String name, int id, double marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public int GetId()
	{
		return id;
	}
	
	public double GetMarks()
	{
		return marks;
	}
	
	public String toString()
	{
		return "\n************Student Grade*********\n"+"Name : "+GetName()+"\nid :"+GetId()+"\nMarks :"+GetMarks();
	}
}
