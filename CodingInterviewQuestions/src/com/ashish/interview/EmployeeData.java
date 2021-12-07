package com.ashish.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeData {
	
	public static void main(String[] args) {
		
		
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee(1,"Ashish",new Employee(101,"Rakesh",null)));
		employeeList.add(new Employee(2,"Ravi",new Employee(101,"Rakesh",null)));
		employeeList.add(new Employee(3,"Abinash",new Employee(102,"Srini",null)));
		employeeList.add(new Employee(4,"Saurav",new Employee(102,"Srini",null)));
		
		System.out.println(employeeList);
		
		Map<Object,Long> employerGroup=employeeList.stream().collect(Collectors.groupingBy(e->e.getManager().getName(),Collectors.counting()));
		
		Map<Object,List<Employee>>  employerGroup1= employeeList.stream().collect(Collectors.groupingBy(e->e.getManager().getName()));
		System.out.println(employerGroup1);
	}
	
	
	

}
