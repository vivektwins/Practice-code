package Test.Integer;

import java.util.ArrayList;
import java.util.List;

public class test_hackerrack {
	
	static int n=0;
	public static void main (String args[])
	{
		
		ArrayList <Integer> as = new ArrayList();
		as.add(1);
		as.add(2);
		as.add(100);
		test_hackerrack(as);
	}
			

    public static int test_hackerrack(List<Integer> ar) {

    	int a=0;
    
       for(int i=0;i<ar.size();i++)
       {
           n+=ar.get(i);
           
       }
       if (n>=10)
       {
    	   
    	   while(n>0)
    	   {
    		   int number = n%10;
    		   n = n/10;
    		   a+=number;
    		   
    	   }
       }
       
       System.out.println(a);
    
    // Write your code here
    
       return n;

    }

}
