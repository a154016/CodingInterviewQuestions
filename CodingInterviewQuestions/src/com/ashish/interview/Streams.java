package com.ashish.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		
		List<Employee1> employeeList=new ArrayList<Employee1>();
		employeeList.add(new Employee1("ashish",1,"Rakesh"));
		employeeList.add(new Employee1("Rahul",1,"Ravi"));
		employeeList.add(new Employee1("Bob",1,"Rakesh"));
		employeeList.add(new Employee1("Tom",1,"Ravi"));
		
		Map<String, List<Employee1>> managerList=employeeList.stream().collect(Collectors.groupingBy(Employee1::getManagerName));
	
	for(Map.Entry<String, List<Employee1>> entry:managerList.entrySet())
	{
		System.out.println(entry.getKey()+":::"+entry.getValue());
	}
	
	
	}
}

class Employee1 implements Cloneable
{
	private String employeeName;
	private int  employeeId;
	private String managerName;
	public Employee1(String employeeName, int employeeId, String managerName) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.managerName = managerName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", managerName=" + managerName
				+ "]";
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
}
