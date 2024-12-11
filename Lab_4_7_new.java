import java.util.Scanner;
public class Lab_4_7_new{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1,j=1;
		System.out.print("Enter string : ");
		String s = sc.next();
		for(i=1;i<=s.length();i++)
		{
			for(j=s.length();j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(""+s.charAt(j-1)+" ");
			}
			System.out.println();
		}
	}
}