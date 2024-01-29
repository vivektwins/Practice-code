package Test.String;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "cat";
	    String b = "acet";
	    
	    ArrayList<Character> as = new ArrayList<Character>();

	    
	    char c[] =a.toCharArray();
	    char c1[] = b.toCharArray();
	    
	    Arrays.sort(c);
	    Arrays.sort(c1);
	    //System.out.println(c +" " + c1);
	    
	    if(Arrays.equals(c, c1))
	    {
	    	System.out.println("Anagram");
	    }
	    else
	    {
	    	System.out.println("Not Anagram");
	    }
	    
	}

}
