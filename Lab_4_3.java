import java.util.Scanner;
public class Lab_4_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int val[] = new int[4];
		float avg;
		int i,sum=0;
		for(i=0;i<4;i++)
		{
			System.out.print("Enter value  of "+i);
			System.out.println(" element : ");
			val[i] = sc.nextInt();
		}
		for(i=0;i<4;i++)
		{
			sum = sum + val[i]; 
		}
		avg = (float)(sum/4.0);
		System.out.println("Average = "+avg);
		sc.close();
	}
}
