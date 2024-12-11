import java.util.Scanner;
public class Lab_4_8_new{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1,j=1;
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=n;i<=2*n-1;i++)
		{
			for(j=n;j<=i+1;j++){
				System.out.print(" ");
			}
			for(j=2*n-2;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}