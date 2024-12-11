import java.util.Scanner;
public class Lab_6_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 Employee employee = new Employee();
        System.out.println("Enter details for Employee:");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Age: ");
        employee.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Phone Number: ");
        employee.phoneNumber = sc.nextLine();
        System.out.print("Address: ");
        employee.address = sc.nextLine();
        System.out.print("Salary: ");
        employee.salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Specialization: ");
        employee.specialization = sc.nextLine();

        Manager manager = new Manager();
        System.out.println("\nEnter details for Manager:");
        System.out.print("Name: ");
        manager.name = sc.nextLine();
        System.out.print("Age: ");
        manager.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Phone Number: ");
        manager.phoneNumber = sc.nextLine();
        System.out.print("Address: ");
        manager.address = sc.nextLine();
        System.out.print("Salary: ");
        manager.salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Department: ");
        manager.department = sc.nextLine();
	System.out.println("==========================================================================");
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
        sc.close();
	}
}
class Member{
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	public void printSalary()
	{
		System.out.println("Salary = "+salary);
	}
}
class Employee extends Member{
	String specialization;
}
class Manager extends Member{
	String department;
}
