package com.ashish.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuestions {

	public static void main(String[] args) {


		String s1="ashish, kumar ,verma";
		String s2="ashishkumar, verma";
		List<String> inputString=new ArrayList<String>();
		inputString.add(s1);
		inputString.add(s2);
	List<String> outputList=	inputString.stream().flatMap(s->Stream.of(s.split(","))).collect(Collectors.toList());
	System.out.println(outputList);
	
		
		
	}

}
