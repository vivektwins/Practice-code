package Test;

import java.util.Arrays;

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
        
        
        int a[]= {5,4};
        for(int i=0;i<a.length;i++)
        {
        	temp = a[i+1];
        	a[i+1]= a[i];
        	a[i]= temp;
        	break;
        			
        }
        
        System.out.println(Arrays.toString(a));
	}
	
	

}
