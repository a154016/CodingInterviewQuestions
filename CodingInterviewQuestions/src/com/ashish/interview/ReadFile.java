package com.ashish.interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	
	
	public static void main(String[] args) throws IOException {
		
	
    File file = new File("C:\\Users\\ashis\\TestDocs\\Records.txt");

    BufferedReader br= new BufferedReader(new FileReader(file));


    String st="";

    int count=0;
    List<Employe> empList=new ArrayList<Employe>();;
    while ((st = br.readLine()) != null)
    {
        
    
    	
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

