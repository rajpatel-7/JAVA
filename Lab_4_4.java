import java.util.Scanner;
public class Lab_4_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		String rev = "";
		int i;
		for(i=s.length()-1;i>=0;i--)
		{
			rev += s.charAt(i);
		}
		System.out.println("Reverse String = "+rev);
		sc.close();
	}
}
