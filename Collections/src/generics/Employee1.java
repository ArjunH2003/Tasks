package generics;

import java.util.ArrayList;

public class Employee1 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setEmpid(100);
		e1.setEmpname("Vijay");
		e1.setEmpsal(50000);
		
		Employee e2 = new Employee();
		
		e2.setEmpid(101);
		e2.setEmpname("Raj");
		e2.setEmpsal(60000);
		
		
		Employee e3 = new Employee();
		
		e3.setEmpid(100);
		e3.setEmpname("Ajay");
		e3.setEmpsal(70000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(Employee e : al) {
			
			System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getEmpsal());
		}
		
	}

}
