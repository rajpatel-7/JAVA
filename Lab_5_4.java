import java.util.Scanner;
public class Lab_5_4
{
	public static void main(String[] args) {
		Bank_Account detail = new Bank_Account();
		detail.getAccountDetails();
		detail.displayAccountDetails();
	}
}
class Bank_Account{
	Scanner sc = new Scanner(System.in);
	double accountNo;
	String username;
	String email;
	String accountType;
	double accountBalance;
	Bank_Account()
	{
		this.accountNo = accountNo;
		this.username = username;
		this.email = email;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public void getAccountDetails()
	{
		System.out.println("Enter AccountNo : ");
		this.accountNo = sc.nextDouble();
		System.out.println("Enter Username : ");
		this.username= sc.next();
		System.out.println("Enter Email : ");
		this.email = sc.next();
		System.out.println("Enter AccountType : ");
		this.accountType = sc.next();
		System.out.println("Enter AccountBalance : ");
		this.accountBalance = sc.nextDouble();
	}
	public void displayAccountDetails()
	{
		System.out.println("Account Number = "+accountNo+"\nUsername = "+username+"\nEmail = "+email+"\nAccount Type = "+accountType+"\nAccount Balance = "+accountBalance);
		sc.close();
	}

}
