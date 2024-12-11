import java.util.Scanner;
public class Lab_5_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hour of t1 = ");
		int h1 = sc.nextInt();
		System.out.print("Enter minute of t1 = ");
		int m1 = sc.nextInt();
		System.out.print("Enter hour of t2 = ");
		int h2 = sc.nextInt();
		System.out.print("Enter minute of t2 = ");
		int m2 = sc.nextInt();
		Time t1 = new Time(h1,m1);
		Time t2 = new Time(h2,m2);
		t1.add(t2);
		sc.close();
	}
}
class Time{
	int hour;
	int min;

	Time(int hour,int min){
		this.hour = hour;
		this.min = min;
	}

	public Time add(Time t2)
	{
		int h3 = this.hour+t2.hour;
		int m3 = this.min + t2.min; 
		for(int i=0;m3>=60;i++)
		{
			if(m3>=60)
			{
				h3++;
				m3-=60;
			}
			else
			{
				break;
			}
		}
			System.out.println("Time = "+h3+" : "+m3);
			Time t3 = new Time(h3,m3);
			return t3;
	}
}
