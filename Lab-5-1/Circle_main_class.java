import java.util.Scanner;
public class Circle_main_class
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Circle_class ar = new Circle_class();
		System.out.println("Enter radius of circle : ");
		int r = sc.nextInt();
		double res = ar.area(r);
		System.out.println(res);
		sc.close();
	}
}
