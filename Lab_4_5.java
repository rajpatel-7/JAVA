import java.util.Scanner;
public class Lab_4_5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("Length of string = "+s.length());
		int i;
		System.out.print("Second half of string = ");
		System.out.println(s.substring((s.length())/2));
		sc.close();
		
	}
}
