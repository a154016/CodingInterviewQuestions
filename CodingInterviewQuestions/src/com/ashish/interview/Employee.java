package com.ashish.interview;

public class Employee implements Comparable<Employee>, Cloneable {

	int id;
	String name;
	Employee manager;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", manager=" + manager + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	@Override
	public int hashCode() {
		return 31 * this.id;
	}

	public boolean equals(Object obj) {

		Employee emp = (Employee) obj;
		if (this == obj) {
			return true;

		}
		if (obj == null)

		{
			return false;
		}
		if (this.id == emp.id && this.name.equals(emp.name)) {
			return true;
		}
		return false;

	}

	public Employee(int id, String name, Employee manager) {
		super();
		this.id = id;
		this.name = name;
		this.manager=manager;
	}

	public Employee() {
		super();
		this.id = id;
		this.name = name;
		this.manager=manager;
	}

	@Override
	public int compareTo(Employee o) {

		return (this.name.compareTo(o.name));
	}

}
