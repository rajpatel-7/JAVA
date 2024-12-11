import java.util.Scanner;
public class Lab_2_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to perform operation");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("Press + to add,Press - to subtract, Press * to multiply, Press / to divide, Press % for remaider");
		String s = sc.next();
		switch(s)
		{
		case "+":
			System.out.println("Sum = "+(a+b));
			break;
		case "-":
			System.out.println("Difference = "+(a-b));
			break;
		case "*":
			System.out.println("Product = "+(a*b));
			break;
		case "/":
			
			if(b==0)
			{
				System.out.println("Cannot be divided by zero");
				while(b==0)
				{
				System.out.println("Reenter a value of b : ");
				b = sc.nextDouble();				
				}
			}
			System.out.println("Quotient = "+(a/b));
			

			break;
		case "%":
			System.out.println("Remainder = "+(a%b));
			break;
		default:
			System.out.println("Enter a valid operation");
		}
		sc.close();
	}
}
