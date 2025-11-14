package com.example.ui;

//import java.sql.*;
//
//import javax.swing.JOptionPane;
//
//import com.example.bean.EmployeeBean;
//import com.example.dao.AdministratorDao;
//
//public class Main {
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");//Registering and Loading database driver
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ustglobal","root","pass@word1");
//		System.out.println("Connected Successfully....");
//		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
//		ps.setInt(1, 101);
//		ps.setString(2, "Karthik");
//		ps.setInt(3, 45000);
//		int i = ps.executeUpdate();
//		System.out.println(i+" record inserted successfully");
//	}

//	public static void main(String[] args) {
//		
//		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID"));
//		String name = JOptionPane.showInputDialog("Enter employee name");
//		int salary = Integer.parseInt(JOptionPane.showInputDialog("Salary"));
//		EmployeeBean eb = new EmployeeBean();
//		eb.setId(id);
//		eb.setName(name);
//		eb.setSalary(salary);
//		
//		//JOptionPane.showMessageDialog(null,AdministratorDao.addBean(eb)+"record inserted successfully");
//		//JOptionPane.showMessageDialog(null,AdministratorDao.updateEmployee(eb)+"record updated successfully");
//		JOptionPane.showMessageDialog(null,AdministratorDao.deleteEmployee(id)+"record deleted successfully");
//		
//	}
//	
//}


import java.sql.*;


import javax.swing.JOptionPane;

import java.util.*;

import com.example.bean.EmployeeBean;

import com.example.dao.AdministratorDao;

public class Main {

public static void main(String[] args)throws ClassNotFoundException, SQLException {

ArrayList<EmployeeBean> al=AdministratorDao.selectAllEmployee();

String str="";

for(EmployeeBean e:al)

{

str+=e.getId()+" "+e.getName()+" "+e.getSalary()+"\n";

}

JOptionPane.showMessageDialog(null, str);

//	int id=Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID"));

//	EmployeeBean e1=AdministratorDao.selectEmployeeById(id);

//JOptionPane.showMessageDialog(null, e1.getId()+" "+e1.getName()+" "+e1.getSalary());

	//JOptionPane.showMessageDialog(null, AdministratorDao.deleteEmployee(id)+" record deleted successfully...");

	//	String name=JOptionPane.showInputDialog("Enter Employee Name");

//	int salary=Integer.parseInt(JOptionPane.showInputDialog("Enter Salary"));

//	EmployeeBean eb=new EmployeeBean();

//	eb.setId(id);

//	eb.setName(name);

//	eb.setSalary(salary);

	//JOptionPane.showMessageDialog(null, AdministratorDao.addEmployee(eb)+" record inserted successfully...");

//	JOptionPane.showMessageDialog(null,AdministratorDao.updateEmployee(eb)+" record updated successfully....");

}

}
