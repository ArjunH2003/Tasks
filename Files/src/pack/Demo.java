package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		
		
		//File f1 = new File("D:/UST-Training");
		//File f2 = new File("D:/Ust-Training");
		//f1.renameTo(f2);
		//f1.mkdir();
		//System.out.println("File created successfully...");
		//System.out.println("File renamed successfully...");
		
		
		
//		File f2 = new File("D:/Ust-Training/A.txt");
//		try {
//			
//			f2.createNewFile();
//			
//		} catch(IOException e) {
//			
//			e.printStackTrace();
//			
//			
//		}
//		
//		System.out.println("File created successfully...");
//	
		
//		}
		
//		
//		FileOutputStream fos = new FileOutputStream("D:/Ust-Training/A.txt");
//		String str = "Welcome to UST..";
//		byte b[] = str.getBytes();
//		fos.write(b);
//		System.out.println("Message written successfully...");
		
//		
//		FileInputStream fos = new FileInputStream("D:/Ust-Training/A.txt");
//		int i = 0;
//		
//		while((i = fos.read())!= -1) {
//			System.out.print((char)i);
//		}
		
		
		
//		
//		FileWriter fw = new FileWriter("D:/Ust-Training/B.txt");
//		String str = "Welcome to UST Global..";
//		fw.write(str);
//		System.out.println("File created successfully...");
//		fw.close();
//		
//		
//		
		FileReader fr = new FileReader("D:/Ust-Training/B.txt");
		int i = 0;
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
			
		}
		
		
		
		

	}
}
