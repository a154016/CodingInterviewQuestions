package com.ashish.interview;

public class KadaneAlgo {
	
	public static void main(String[] args) {
		
		
	}
	
	private static void getSubArrayWithMaxSum(int[] inputArray)
	{
		//initialize bestSum to first element of array
		//bestStart and bestEnd=0
		    int bestSum = inputArray[0];
	        int bestStart = 0;
	        int bestEnd = 0;
	        int currentSum = 0;
	        int currentStart = 0;
	        
	        
	        for(int i=0;i<inputArray.length;i++)
	        {
	        	currentSum=currentSum+inputArray[i];
	        	
	        	  if(currentSum < 0)
	              {
	                  currentSum = 0;
	                  currentStart = i+1;
	              }
	        	  else if(bestSum<currentSum)
	        	{
	        		bestSum=currentSum;
	        		bestStart=currentStart;
	        		bestEnd=i;
	        	}
	        	  
	        }
		
	}

}
