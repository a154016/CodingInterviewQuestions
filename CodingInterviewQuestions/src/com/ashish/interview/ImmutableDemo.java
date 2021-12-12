package com.ashish.interview;

public final class  ImmutableDemo {
	
	private String name;
	private int id;
	private Employee employee;
	

	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


	public Employee getEmployee() {
		return this.employee;
	}


	public ImmutableDemo(String name, int id, Employee employee) {
		super();
		this.name = name;
		this.id = id;
		//this.employee = employee;
		Employee e =new  Employee(1,"Ravi",new Employee(2,"Rakesh",null));
		this.employee=e;
	}
	
	

}
