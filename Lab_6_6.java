import java.util.Scanner;
public class Lab_6_6{
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		sc.close();
	}
}
class Parent{
	public void display()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Parent{
	public void display()
	{
		super.display();
		System.out.println("Child Class");
	}
	
}
