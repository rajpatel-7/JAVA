public class Lab_4_6
{
	public static void main(String[] args) 
    {
        for(int i=0;i<args.length;i++) 
        {

            if(args[i].charAt(0)>=65 &&  args[i].charAt(0)<=91)
            {
                continue;
            }
            else
            {
                System.out.println("Error occured");
                return;
            }
        
        }
    }
}
