package class3;
//import java.io.file;
import java.io.*;
//import java.io.FileNotFoundException;
//import java.io.FileReader;

public class stringreading {

	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\hp_pro\\Desktop\\abc.txt");
		FileReader in = new FileReader(file);
		
		int c;
		while((c= in.read())!=-1) {
			System.out.print((char)c);
		}

	}

}
