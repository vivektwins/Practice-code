package Test.String;

import java.util.ArrayList;

public class TwoStringArrayPrintingOneByOne {
	 public static void main(String args[])
	    {
	    String one = "abcd12"; 
	    String two = "pqrstu45"; 
	    StringBuilder bs = new StringBuilder(one);
	    bs.reverse();
	    StringBuilder bf = new StringBuilder(two);
	    bf.reverse();
	    
	    char c[] = bs.toString().toCharArray();
	    char c1[] = bf.toString().toCharArray();
	    
	    for(int i=0;i<c1.length;i++)
	    {
	    	System.out.print(c1[i]);
	    	if(c.length>i)
	    	{
	    		System.out.print(c[i]);
	    	}
	    }
	    	

	    }

}
