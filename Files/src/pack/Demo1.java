package pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo1 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
					
		EmployeeBean eb = new EmployeeBean(101,"vijay",65000);
		FileOutputStream fos = new FileOutputStream("D:/Ust-training/D.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(eb);
		
		FileInputStream fis = new FileInputStream("D:/Ust-training/D.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		EmployeeBean e = (EmployeeBean)ois.readObject();
		System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal());
		
		
		
	}

}
