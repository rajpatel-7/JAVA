import java.util.Scanner;
public class Lab_6_7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		Child c = new Child(n);
		sc.close();
	}
}
class Parent{
	final int n=120;
	Parent(int n)
	{
		this.n = n;
	}
}
class Child extends Parent{
	Child(int n)
	{
		super(n);
		System.out.println("Final value = "+n);
	}
}
