package HappyAprilFool;
import java.util.Scanner;
public class HappyAprilFool {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Name :");
	String name = sc.nextLine();
	System.out.print("Enter ID :");
	int id = sc.nextInt();
	System.out.print("Enter Marks :");
	double marks = sc.nextDouble();
	
	Grading Grade = new Grading(name,id,marks);
	Grade.setGrade();
	System.out.print(Grade.toString());
}
}
