package com.ashish.interview;

public class Runner {

	public static void print(String s) {
		System.out.println("value " + s);
	}

	public static void print(Integer s) {
		System.out.println("value " + s);
	}

	public static void main(String[] args) {
/*		System.out.println("Hello World");
		

final StringBuilder sb =new StringBuilder();
sb.append("ad");
System.out.println(sb);*/
		

		//print(null);
		// Ambiguous method call 
		//both method print(String) in HelloWorld and method print(Integer) in HelloWorld match
		
		
		A a =new A();
		B b=new B();
		A a1=new B();
		a.show();
		b.show();
		a1.show();
		System.out.println(a.a);
		System.out.println(b.a);
		System.out.println(a1.a);// parent only
	}
}

class A
{
	
	int a=10;
	static void show()
	{
		System.out.println("Show A called");
	}
}

class B extends A
{
	
	int a=20;
	static void show()
	{
		System.out.println("Show B called");
	}
}