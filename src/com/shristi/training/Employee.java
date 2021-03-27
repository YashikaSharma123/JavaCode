package com.shristi.training;
public class Employee {
	String name;
	int empId;
	double salary;
	
public void getDetails() {
	System.out.println("Name"+ name);
	System.out.println("empid"+empId);
	System.out.println("salary"+salary);
}
public String greetMessage(String msg) {
	return msg+name;
}
	public static void main(String[] args) {
	Employee emp=new Employee();
	emp.name="Ram";
	emp.empId=12;
	emp.salary=123.9;
	System.out.println(emp.name+"\t"+emp.empId+"\t"+emp.salary);
	emp.getDetails();
	String message=emp.greetMessage("Have a nice day");
	System.out.println(message);
	System.out.println();
	
	Employee emp1=new Employee();
	emp1.name="Rama";
	emp1.empId=112;
	emp1.salary=1213.9;
	System.out.println(emp1.name+"\t"+emp1.empId+"\t"+emp1.salary);
	emp1.getDetails();
	System.out.println(emp1.greetMessage("Welcome"));
	
//	Employee emp2=new Employee();
//	emp2.name="Helen";
//	System.out.println(emp2.name+"\t"+emp2.empId+"\t"+emp2.salary);
//	System.out.println(emp2.name);
//	System.out.println(emp.name);
//	//emp=null;
//	System.out.println(emp2.name);
//	System.out.println(emp.name);
}
	}
