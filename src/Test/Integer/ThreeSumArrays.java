package Test.Integer;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumArrays {
	static ArrayList<String> as = new ArrayList<String>();


	private static void getArrayTriplets(int[] inputArray, int sum)
    {
        System.out.println("Input Array : "+Arrays.toString(inputArray));
          
        System.out.println("Given Number : "+sum);
          
        System.out.println("Array triplets whose sum is "+sum+" are :");
          
        //Method 3 : Using Sorting
          
        Arrays.sort(inputArray);
          
        for (int i = 0; i < inputArray.length; i++) 
        {
        	int left = i+1;
        	int right = inputArray.length-1;
        	
        	
        	while(left<right)
        	{
        		if(inputArray[i]+inputArray[left]+inputArray[right]==sum)
        		{
        			System.out.println("["+inputArray[i] + ", " + inputArray[left] + ", " + inputArray[right]+"]");
        			left++;
        			right--;
        		}
        		else if(inputArray[i]+inputArray[left]+inputArray[right]<sum)
        		{
        			left++;
        			
        		}
        		else
        		{
        			right--;
        		}
        	}
           
        }
    }
      
    public static void main(String[] args) 
    {
        getArrayTriplets(new int[] {7, 5, 9, 3, 0, 8, 6}, 20);
  
        System.out.println("===========================");
          
        getArrayTriplets(new int[] {-3, 7, -1, -5, 2, -9, 1}, 0);
          
        System.out.println("===========================");
          
        getArrayTriplets(new int[] {17, 51, 39, 29, 33, 21, 65}, 89);
        
        
        	int a[] = {7, 5, 9, 3, 0, 8, 6};
        	int sum= 20;
        	String temp="";
        	
        	for(int i=0;i<a.length;i++)
        	{
        		for(int j=0;j<a.length;j++)
        		{
        			for(int k=0;k<a.length;k++)
        			{
        				if(a[i]+a[j]+a[k]==sum)
        				{
        					temp+= String.valueOf(a[i]);
        					temp+= String.valueOf(a[j]);
        					temp+= String.valueOf(a[k]);
        					
        					char c[]= temp.toCharArray();
        					Arrays.sort(c);
        					//System.out.println(c);
        					temp=String.valueOf(c);
        					
        					
        					if(!as.contains(temp))
        					{
        				    
        						
        					as.add(temp);
        					
        					}
        					temp ="";
        					
        					
        				}
        			}
        		}
        	}
        	
        	System.out.println(as);
        	
            
        }
    }
