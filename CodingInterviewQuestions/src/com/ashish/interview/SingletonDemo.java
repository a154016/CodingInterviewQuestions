package com.ashish.interview;

import java.io.Serializable;

public class SingletonDemo  implements Serializable , Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5065093786507960212L;
	private SingletonDemo()
	{
		
	}

	
	private static volatile SingletonDemo instance;
	public static  SingletonDemo getInstance() {
		
		if(instance==null)
		{
			synchronized(SingletonDemo.class)
			{
				if(instance==null)
				{
					instance =new SingletonDemo();
				}
			}
			
		}
		return instance;
		
	}
	
}
 