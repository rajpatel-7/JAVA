import java.io.*;
public class Lab_11_1{
	public static void main(String[] args) {
		File f = new File("File.txt");
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("File.txt"));
			bw.write("Aum,19\n");
			bw.close();
			System.out.println("Data written successfully");

		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			BufferedReader br = new BufferedReader(new FileReader("File.txt"));
			String line;
			while((line  = br.readLine())!=null){
				String name_age[] = line.split(",");
				String name = name_age[0];
                int age = Integer.parseInt(name_age[1]);
                Student st = new Student(name, age);
                System.out.println(st);
			}	
			br.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
class Student{
	String name;
	int age;
	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "Name of student = "+name+"Age of student = "+age;
	}

}