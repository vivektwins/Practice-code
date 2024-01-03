package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "cat";
	    String b = "act";
	    
	    ArrayList<Character> as = new ArrayList<Character>();

	    
	    char c[] =a.toCharArray();
	    char c1[] = b.toCharArray();
	    
	    Arrays.sort(c);
	    Arrays.sort(c1);
	    
	    if(c.equals(c1))
	    {
	    	System.out.println("Anagram");
	    }
	    else
	    {
	    	System.out.println("Not Anagram");
	    }
	    
	}

}
