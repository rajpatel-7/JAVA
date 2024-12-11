import java.util.Scanner;
public class Lab_2_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit : ");
		double f = sc.nextDouble();
		double c = ((f-32.0)*5.0)/9.0;
		System.out.println("Value of temperature in Celsius : "+c);
		sc.close();
	}
}
