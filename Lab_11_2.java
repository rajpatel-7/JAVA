import java.io.*;
public class Lab_11_2{
	public static void main(String[] args) {
		String filename = args[0];
		File f = new File(filename);
		if(!f.exists()){
			System.out.println("File or directory not Found");
			return;
		}
		if(f.isFile()){
			System.out.println("Length of file = "+f.length());
		}
		else{
			File[] files = f.listFiles();
			if(files!=null){
				for(File file : files){
					System.out.println(file.getName());
				}
			}
		}
	}
}