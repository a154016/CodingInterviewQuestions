package com.ashish.interview;

import java.util.HashMap;

public class TreeSetRunner {
	
	public final int a=0;

	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"Ashish");
		Employee emp2 = new Employee(1,"Ashish");
		Employee emp3 = new Employee(1,"Mansi");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));
		emp1.id=1;
		HashMap<Employee ,Boolean> hm = new HashMap<>();
		hm.put(emp1,true);
		hm.put(emp2,false);
		hm.put(emp3,true);
		System.out.println(hm.size());
		emp1.id=3;
		System.out.println(hm.get(emp1));
		Employee test=emp1;
		System.out.println(emp1==test);
		
		/*
		 * if(true) { break; }
		 */
		/*
		 * Employee e1=new Employee(1,"Bshish"); Employee e2=new Employee(2,"Ashish");
		 * TreeSet<Employee> tree=new TreeSet<Employee>(); tree.add(e1); tree.add(e2);
		 * System.out.println(tree); for(Employee e:tree) { System.out.println(e.name);
		 * main("Ashish"); }
		 */
	}

	
	public static void main(String args)
	{
		System.out.println("overloaded");
	}
}
