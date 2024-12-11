import java.util.Scanner;
public class Lab_3_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total marks : ");
		double total_marks = sc.nextDouble();
		System.out.print("Enter marks of maths = ");
		double maths = sc.nextDouble();
		System.out.print("Enter marks of ss = ");
		double ss = sc.nextDouble();
		System.out.print("Enter marks of physics = ");
		double physics = sc.nextDouble();
		System.out.print("Enter marks of chemistry = ");
		double chemistry = sc.nextDouble();
		System.out.print("Enter marks of computer = ");
		double computer = sc.nextDouble();
		double per = (((maths+ss+physics+chemistry+computer)/5.0)/total_marks)*100.0;
		if(per>=60)
		{
			System.out.println("First Division");
		}
		else if(per>50)
		{
			System.out.println("Second Division");
		}
		else if(per>40)
		{
			System.out.println("Third Division");
		}
		else
		{
			System.out.println("Fail");
		}
		sc.close();
	}
}
