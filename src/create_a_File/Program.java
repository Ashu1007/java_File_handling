package create_a_File;

import java.io.File;

public class Program {
	public static void main(String[] args) {
		File f1=new File("D:\\abc.txt");
		
		try {
			f1.createNewFile();
			System.out.println("File is created");
			System.out.println("File Size is: "+f1.length());
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			System.out.println(false);
			
		} catch (Exception e) {
			System.out.println("File is Not Cerated");
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends");
	}

}
