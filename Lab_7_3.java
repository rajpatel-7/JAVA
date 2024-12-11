abstract class Animal{
	String s;
	abstract public void animal();
}
class Tiger extends Animal{
	public void animal()
	{
		System.out.println("Tiger");
	}
}
class Camel extends Animal implements Transport{
	public void animal()
	{
		System.out.print("Camel -> ");
	}
	public void deliver()
	{
		System.out.println("Deliver Method Invoked ");
	}
}
class Deer extends Animal{
	public void animal()
	{
		System.out.println("Deer");
	}
}
class Donkey  extends Animal implements Transport{
	public void animal()
	{
		System.out.print("Donkey -> ");
	}
	public void deliver()
	{
		System.out.println("Deliver Method Invoked ");
	}
}
interface Transport{
	public void deliver();
}
public class Lab_7_3{
	public static void main(String[] args) {
		Animal[] a = {new Tiger(),new Camel(),new Deer(),new Donkey()};
		for(int i=0;i<4;i++)
		{
			if(a[i] instanceof Transport)
			{
				((Animal)a[i]).animal();
				((Transport)a[i]).deliver();
			}
			else{
				((Animal)a[i]).animal();
			}
		}
	}
}