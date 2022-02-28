package com.lti.services;

import java.util.List;

import com.lti.entity.Employee;

public interface EmpServices {

	
	public List<Employee> getEmpList();

	public int addEmp(Employee emp);

	public int updateEmp(int empNo,double sal);
}
