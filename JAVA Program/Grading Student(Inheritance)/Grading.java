package HappyAprilFool;

public class Grading extends Student{
	
	private char grade;
	
	public Grading(String name,int id, double marks)
	{
		super(name,id,marks);
	}
	
    public void setGrade()
    {
    	if(marks>=50)
    		grade='P';
    	else
    		grade='F';
    }
    
    public char getGrade() {
        return grade;
    }
    
    public String toString()
    {
    return super.toString()+"\nGrade :"+getGrade();
    }
}
    

