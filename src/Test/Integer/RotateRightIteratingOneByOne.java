package Test.Integer;

import java.util.Arrays;

import Test.test;

public class RotateRightIteratingOneByOne {
	
	//https://www.geeksforgeeks.org/how-to-left-or-right-rotate-an-array-in-java/
	
	public static void recursive(int ar[], int d, int n)
	{
		for(int i=0;i<n-d;i++)
		{
		
			rotate(ar,d,n);
		}
		
		System.out.println(Arrays.toString(ar));
	}
	
	public static void rotate(int ar[], int d, int n)
	{
		int i=0, temp=0;
		temp = ar[0];
		for(i=0;i<ar.length-1;i++)
			ar[i]= ar[i+1];
	    ar[i]= temp;
	    System.out.println(Arrays.toString(ar));
	}
	
	 
	
    public static void main(String[] args)
    {
        // Creating an object of class inside main()
 
        // Custom input elements
        int a[] = { 1, 2, 3, 4, 5 };
        int d=1;
        int n=a.length;
        recursive(a,d,n);
        
        
        
 
        
        
    }

}
