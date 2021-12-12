package com.ashish.interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	
	
	public static void main(String[] args) throws IOException {
		
	
	 // File path is passed as parameter
    File file = new File(
        "C:\\Users\\ashis\\TestDocs\\Records.txt");

    // Note:  Double backquote is to avoid compiler
    // interpret words
    // like \test as \t (ie. as a escape sequence)

    // Creating an object of BufferedReader class
    BufferedReader br
        = new BufferedReader(new FileReader(file));

    // Declaring a string variable
    String st="";
    // Consition holds true till
    // there is character in a string
    int count=0;
    List<Employe> empList=new ArrayList<Employe>();;
    while ((st = br.readLine()) != null)
    {
        // Print the string
    
    	
    }
    Employe emp=new Employe();
    	emp.setName(st);
    	
    	emp.setCompanyName(st);
    	emp.setCompanycode(st);
    	count++;
    System.out.println(emp);
    }
    
        //System.out.println(st);
   
	}
	}

