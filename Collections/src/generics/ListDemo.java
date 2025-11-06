package generics;

import java.util.*;


public class ListDemo {

ArrayList<Employee2> al;

public ArrayList<Employee2> addAndViewAllEmployee2()

{

al=new ArrayList<Employee2>();

al.add(new Employee2(101,"Vijay",45000));

al.add(new Employee2(102,"Karthik",56000));

al.add(new Employee2(103,"Praveen",66000));

return al;

}

public Employee2 viewEmployeeById(int empid)

{

Employee2 eb=new Employee2();

for(Employee2 e:al)

{

if(e.getEmpid()==empid)

{

eb=e;

}

}

return eb;

}

public static void main(String[] args) {

ListDemo ld=new ListDemo();

ArrayList<Employee2> allEmp=ld.addAndViewAllEmployee2();

//allEmp.forEach(e->{System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getEmpsal());});

Employee2 emp=ld.viewEmployeeById(102);

System.out.println(emp.getEmpid()+" "+emp.getEmpname()+" "+emp.getEmpsal());

}

}