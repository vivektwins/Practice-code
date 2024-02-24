package Test.Integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 100, y = 200;
		 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        // Swapping using three
        // Variables
        int temp = y;
        y = x;
        x = temp;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        
        int a1[]= {5,4};
        for(int i=0;i<a1.length;i++)
        {
        	temp = a1[i+1];
        	a1[i+1]= a1[i];
        	a1[i]= temp;
        	break;
        			
        }
        
        System.out.println(Arrays.toString(a1));
        
        int a[]= {1,2,3,4,5,6,7,8};
		
		int n=3;
		int m1=7;
		ArrayList<Integer> as = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			as.add(a[i]);
		}
				int temp1 = a[m1];
				a[m1]=a[n];
				a[n]= temp1;
			
			
		
		Collections.swap(as, n, m1);
		System.out.println(Arrays.toString(a));
		System.out.println(as);
	}
	
	

}
