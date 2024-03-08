package Test.String;

import java.util.ArrayList;

import Test.test;

public class AllcombinationOfABCandPalindrome {
	static ArrayList<String> as = new ArrayList<String>();
	public static void printall(StringBuffer prefix, char[] c, int length) {
        if(length == 0) {
            //count++;
            System.out.println(prefix.toString());
            as.add(prefix.toString());
            return;
        }
        for(int i=0; i<c.length; i++) {
        	StringBuffer prefixPlusOne = new StringBuffer();
            prefixPlusOne.append(prefix.toString());
            prefixPlusOne.append(c[i]);
            printall(prefixPlusOne, c, length-1);
        }
    }
    
   

	public static void main(String[] args) {
	
		String s= "ABC";
		AllcombinationOfABCandPalindrome.printall(new StringBuffer(),s.toCharArray(),1);
		AllcombinationOfABCandPalindrome.printall(new StringBuffer(),s.toCharArray(),2);
		AllcombinationOfABCandPalindrome.printall(new StringBuffer(),s.toCharArray(),3);
		System.out.print(as);
		
		System.out.println();
		
		for(int i=0;i<as.size();i++)
		{
			if(as.get(i).length()!=1)
			{
			StringBuffer buffer = new StringBuffer(as.get(i));
			buffer.reverse();
			
			if(as.get(i).equals(buffer.toString()))
			{
				System.out.print(as.get(i) + " ");
			}
			}
		}
		
		
		
	}
}
