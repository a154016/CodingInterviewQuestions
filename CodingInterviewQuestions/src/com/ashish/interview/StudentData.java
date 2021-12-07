package com.ashish.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentData {
	
	public static void main(String[] args) {
		
		
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(1, "Ashish",99));
		studentList.add(new Student(2, "Ravi",88));
		studentList.add(new Student(3, "Rahul",77));;
		studentList.add(new Student(4, "Saurav",11));
		studentList.add(new Student(5, "Ankit",22));
		//studentList=studentList.stream().filter(s->s.getMarks()>40).collect(Collectors.toList());
		System.out.println(studentList);
		List<Student> sortedMarks=studentList.stream().sorted((Student s1, Student s2)->s1.getMarks()-s2.getMarks()).collect(Collectors.toList());
		for(Student  s:sortedMarks)
		{
			System.out.println(s);
		}
	}

}
