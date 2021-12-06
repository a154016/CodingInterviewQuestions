package com.ashish.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapOnValues {
	
	public static void main (String args[])
	{
		
		Map<Integer,String> employeeIDAndNameMap=new HashMap<Integer, String>();
		employeeIDAndNameMap.put(101, "Ashish");
		employeeIDAndNameMap.put(102, "Ravi");
		employeeIDAndNameMap.put(103, "Rahul");
		employeeIDAndNameMap.put(104, "Kumar");
		employeeIDAndNameMap.put(105, "Verma");
		employeeIDAndNameMap.put(106, "Ganesh");
		
		//System.out.println(employeeIDAndNameMap);
		employeeIDAndNameMap.forEach((k,v)->System.out.println(k +"\t"+v));
		
		System.out.println("Sort based on values");
	Set<Entry<Integer,String>>entrySet =employeeIDAndNameMap.entrySet();
	List<Entry<Integer,String>> list=new ArrayList<>(entrySet);
	Collections.sort(list, new Comparator<Entry<Integer,String>>()
			{
		public int compare(Entry<Integer,String> o1,Entry<Integer,String> o2)
		{
			return o1.getValue().compareTo(o2.getValue());
		}
			
		
		
	

});
	list.forEach(s->{
		
	System.out.println(s.getKey()+"\t"+s.getValue());
	});
}
}
