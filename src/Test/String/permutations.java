package Test.String;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class permutations{

	
	public static ArrayList<String> getPermutations(String str){
		ArrayList<String> permutations = new ArrayList<String>();
		if(str==null)
		{
			return permutations;
		}
		else if(str.length()==0)
		{
			permutations.add("");
			return permutations;
		}
		
		char first = str.charAt(0);
		String sub = str.substring(1);
		
		ArrayList<String> word = getPermutations(sub);
		
		for(String words: word)
		{
			for(int i=0;i<=words.length();i++)
			{
			
				permutations.add(words.substring(0,i)+first+words.substring(i));
			}
			
		}
		return permutations;
		
	}
	
    public static void main (String args[])
    {
    	String s = "abc";
    	System.out.println(getPermutations(s));
    	Scanner s1 = new Scanner(System.in);
//    	System.out.println("Enter chumma");
//    	String data = s1.nextLine();
    	
    }
}