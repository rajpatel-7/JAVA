public class Lab_9_2{
	public static void main(String[] args) {
		Thread o = new Thread(new Odd());
		Thread e = new Thread(new Even());
		o.start();
		e.start();
		try{
			o.join();
			e.join();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("Program Completed");
	}
}
class Odd implements Runnable{
	public void run(){
		for(int i=1;i<=20;i+=2)
		{
			try{
				System.out.println("Odd Thread: "+i);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Even implements Runnable{
	public void run(){
		for(int i=2;i<=20;i+=2)
		{
			try{
				System.out.println("Even Thread: "+i);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
