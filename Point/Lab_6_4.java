package Point;
import java.util.Scanner;
public class Lab_6_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter coordinates of point : ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.print("\nEnter coordinates of another point : ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
        MyPoint point1 = new MyPoint(x1,y1);
        MyPoint point2 = new MyPoint(x2, y2);
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
        System.out.println("Distance between point1 and (0, 0): " + point1.distance(0, 0));

        sc.close();

	}
}
class MyPoint{
	double x,y;
	public MyPoint()
	{
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public double getx()
	{
		return x;
	}
	public double gety()
	{
		return y;
	}
	public double distance(double x,double y)
	{
        x = this.x - x;
        y = this.y - y;
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
	public double distance(MyPoint p)
	{
		double x = this.getx() - p.getx();
		double y = this.gety() - p.gety();
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
	
}