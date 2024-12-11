public class Lab_7_1{
	public static void main(String[] args) {
		Potato p = new Potato("Brown");
		Brinjal b = new Brinjal("Purple");
		Tomato t = new Tomato("red");
		System.out.println(p);
		System.out.println(b);
		System.out.println(t);
	}
}
abstract class Vegetable{
	String color;
	public Vegetable(String color)
	{
		this.color = color;
	}
	abstract public String toString();
}
class Potato extends Vegetable{
	public Potato(String color)
	{
		super(color);
	}
	public String toString()
	{
		return "Name = Potato : Color = "+color;
	}
}
class Brinjal extends Vegetable{
	public Brinjal(String color)
	{
		super(color);
	}
	public String toString(){
		return "Name = Brinjal : Color = "+color; 
	}
}
class Tomato extends Vegetable{
	public Tomato(String color)
	{
		super(color);
	}
	public String toString(){
		return "Name = Tomato : Color = "+color;
	}
}
