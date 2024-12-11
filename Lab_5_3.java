import java.util.Scanner;
public class Lab_5_3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sentence sentence = new Sentence();
		do
		{
			System.out.println("Enter a sentence(type quit to exit)");
			String s = sc.nextLine();
			if(s.equalsIgnoreCase("quit"))
			{
				break;
			}
			sentence.processSentence(s);
		}while(true);
		System.out.println("a = "+sentence.count_a+"\ne = "+sentence.count_e+"\ni = "+sentence.count_i+"\no = "+sentence.count_o+"\nu = "+sentence.count_u);
		sc.close();
	}
}
class Sentence{
	String s;
	int count_a=0;
	int count_e=0;
	int count_i=0;
	int count_o=0;
	int count_u=0;
	Sentence()
	{

		this.s = s;
		this.count_a=count_a;
		this.count_e=count_e;
		this.count_i=count_i;
		this.count_o=count_o;
		this.count_u=count_u;
	}
		public void processSentence(String s)
		{

		for(int i=0;i<s.length();i++)
		{

			if(s.charAt(i)=='a'||s.charAt(i)=='A')
			{
				count_a++;
			}
			if(s.charAt(i)=='e'||s.charAt(i)=='E')
			{
				count_e++;
			}
			if(s.charAt(i)=='i'||s.charAt(i)=='I')
			{
				count_i++;
			}
			if(s.charAt(i)=='o'||s.charAt(i)=='O')
			{
				count_o++;
			}
			if(s.charAt(i)=='u'||s.charAt(i)=='U')
			{
				count_u++;
			}
		}
		}

	}

