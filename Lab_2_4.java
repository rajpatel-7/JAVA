import java.util.Scanner;
public class Lab_2_4
{
	public  static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		double r = sc.nextDouble();
		System.out.println("Area of Circle = "+(Math.PI*Math.pow(r,2)));
		sc.close();
	}
}
