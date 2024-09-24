package file_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\abc.txt");
		FileWriter fw=null;
		
		try {
			f1.createNewFile();
			fw=new FileWriter(f1);
			
			fw.write("3tergreteete");
		} catch (IOException e) {
			System.out.println("File is not Created!");
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
		}
		System.out.println("Program Ends!!");
	}

}
