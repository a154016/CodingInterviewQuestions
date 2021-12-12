package com.ashish.interview;

public class OverloadingDemo {
	
	public static void main(String[] args) {
		System.out.println(add(new Integer(2) , new Integer(3)));
	}
	
	
	public static int  add(Integer  a, Integer b)
	{
		System.out.println("Integer called");
		return a+b;
	}
	public static int  add(int  a, int b)
	{
		System.out.println("int called");
		return a+b;
	}

}
