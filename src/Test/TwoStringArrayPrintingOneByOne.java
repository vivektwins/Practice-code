package Test;

import java.util.ArrayList;

public class TwoStringArrayPrintingOneByOne {
	 public static void main(String args[])
	    {
	    String one = "abcd12"; 
	    String two = "pqrstu45"; 
	    
	    StringBuffer oner = new StringBuffer(one);

	    System.out.println(oner.reverse());
	    
	    StringBuffer twor = new StringBuffer(two);

	    System.out.println(twor.reverse());
	    
	    ArrayList<Character> as = new ArrayList<Character>();
	    
	    //String output = "5241udtcsbraqp";
	    
	    char c[]= oner.toString().toCharArray();
	    char c1[] = twor.toString().toCharArray();
	    
	    
	    for(int i=0;i<c1.length;i++)
	    {
	        
	            as.add(c1[i]);
	            if(c.length>i)
	            {
	            as.add(c[i]);
	            }
	            
	        
	    }
	    
	    
	    
	    System.out.println(as);
	    }

}
