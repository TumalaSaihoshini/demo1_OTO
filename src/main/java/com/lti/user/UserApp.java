package com.lti.user;

import java.util.ArrayList;
import java.util.List;

import com.lti.entity.Employee;
import com.lti.services.EmpServices;
import com.lti.services.EmpServicesImpl;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> userList=new ArrayList();
		EmpServices service=new EmpServicesImpl();
userList=service.getEmpList();
System.out.println("User gets list"+userList);
	Employee emp=new Employee(101,"Ajay",6000);
	
	
	int rec=service.addEmp(emp);//
System.out.println(rec+"added");
	}

}
