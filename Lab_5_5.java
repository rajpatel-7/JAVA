import java.util.Scanner;
public class Lab_5_5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real number of n1 : ");
		double r1 = sc.nextDouble();
		System.out.print("Enter imaginary number of n1 : ");
		double c1 = sc.nextDouble();
		System.out.print("Enter real number of n2 : ");
		double r2 = sc.nextDouble();
		System.out.print("Enter imaginary number of n2 : ");
		double c2 = sc.nextDouble();
		Complex_numbers n1 = new Complex_numbers(r1,c1);
		Complex_numbers n2 = new Complex_numbers(r2,c2);
		n1.add(n2);
		sc.close();
	}
}
class Complex_numbers{
	double real;
	double imaginary;
	Complex_numbers()
	{
		this.real = 0;
		this.imaginary = 0;
	}
	Complex_numbers(double real,double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex_numbers add(Complex_numbers n2)
	{
		double r3 = this.real+n2.real;
		double c3 = this.imaginary+n2.imaginary;
		System.out.println("Addition = "+r3+" + "+c3+"i");
		return new Complex_numbers(r3,c3);
	}
}
