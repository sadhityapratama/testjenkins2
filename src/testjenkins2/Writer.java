package testjenkins2;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("result.txt");
			
			writer.write("masuk nih brader");
			writer.close();
			System.out.println("times like theese");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
