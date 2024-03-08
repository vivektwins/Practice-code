package Test.Integer;

import java.util.Arrays;

import Test.test;

public class ClosestNum {

	  
		public static int match(int a[], int n)
		{
			int b=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==n)
				{
					b= a[i];
					System.out.println(a[i]);
					break;
				}
				
			}
			
			return b;
		}
		public static int check(int a[], int n)
		{
			for(int i=0;i<a.length;i++)
			{
				if(n<a[i] && n!=0)
				{
					System.out.println(a[--i]);
					System.out.println("inner");
					break;
				}
				else if(i==a.length-1 && n!=0)
				{
					System.out.println(a[i]);
				}
			}
			
			return n;
		}
		
		 
		
	    public static void main(String[] args)
	    {
	        // Creating an object of class inside main()
	    	int a[] = {1,2,3,4,5,8};
	    	Arrays.sort(a);
	    	int largest = a[a.length-1];
	    	int n=9;
	    	int count =0;
	    	ClosestNum.match(a, n);
	    	ClosestNum.check(a, n);
	    	
	        
	    }

}
