package class3;

import java.io.*;

public class stringreading2 {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\hp_pro\\Desktop\\abcd.txt");
		FileReader in = new FileReader(file);
		
		int c;
		while((c= in.read())!=-1) {
			System.out.print((char)c);
		}

	}

}
