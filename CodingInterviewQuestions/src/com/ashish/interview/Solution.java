package com.ashish.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    int sum=0;
  //  int lengthArray=arr.size();
  int[] outputArray=new int[4];
  int finalSum=0;
    for(int i=1;i<6;i++)
    {
        for(int j=1;j<6;j++)
        {
			/*
			 * sum=arr.get[i-1][j-1]+arr.get[i-1][j]+arr.get[i-1][j+1]+arr.get[i][j]+
			 * arr.get[i+1][j-1]+arr.get[i+1][j]+arr.get[i+1][j+1];
			 */
        	
        	sum=arr.get(i-1).get(j-1)+arr.get(i-1).get(j)+arr.get(i-1).get(j+1)+arr.get(i).get(j)
        			+arr.get(i+1).get(j+1)+arr.get(i+1).get(j)+arr.get(i+1).get(j+1);
        	System.out.println("sum +::"+sum);
        	sum=0;
        }
        
        }
    return sum;
    }

   
}

public class Solution {
    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();
        
        List<Integer> arr1=Arrays.asList(1 ,1, 1, 0, 0, 0);
        arr.add(Arrays.asList(1 ,1, 1, 0, 0, 0));
        arr.add(Arrays.asList(1 ,1, 1, 0, 0, 0));
        arr.add(Arrays.asList(1 ,1, 1, 0, 0, 0));
        arr.add(Arrays.asList(1 ,1, 1, 0, 0, 0));
        arr.add(Arrays.asList(1 ,1, 1, 0, 0, 0));
        arr.add(Arrays.asList(1 ,1, 1, 0, 0, 0));
        

       
        System.out.println(arr);

        int result = Result.hourglassSum(arr);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedReader.close();
       // bufferedWriter.close();
    }
}
