package file_Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) throws IOException {
		FileWriter fw=null;
		
		try {
			fw=new FileWriter("D:\\abc.txt");
			System.out.println("File is created");
			char[] x= {'a','b','c','d','e','f','g'};
			fw.write(x);
			fw.write(x,2,3);
			fw.write("\n");
			fw.write("Mohan is here", 3 ,4);
		} catch (IOException e) {
			System.out.println("File is not Found");
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
		}
		System.out.println("Program Ends");
	}

}
