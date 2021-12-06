package com.ashish.interview;

public class Employee implements Comparable<Employee> {
	
	
	@Override
	public int hashCode() {
		return 31*this.id;
	}
	
	public boolean equals(Object obj)
	{
		
		Employee emp=(Employee)obj;
		if(this==obj)
		{
			return true;
			
		}
		if(obj==null)
		
		{
			return false;
		}
		if(this.id==emp.id&& this.name.equals(emp.name))
		{
			return true;
		}
		return false;
		
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
		this.id = id;
		this.name = name;
	}
	int id;
	String name ;
	@Override
	public int compareTo(Employee o) {
		
		return (this.name.compareTo(o.name));
	}

}
