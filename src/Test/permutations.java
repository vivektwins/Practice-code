package Test;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class permutations{

	public static Set<String> getPermutations(String str)
	{
		Set<String> permutations = new HashSet<String>();
		if(str==null)
		{
			return null;
		}
		else if(str.length()==0)
		{
			permutations.add("");
		return permutations;
		}
		
		char first = str.charAt(0);
		String sub = str.substring(1);
		Set<String> word = getPermutations(sub);
		for(String strnew: word)
		{
			for(int i=0;i<=strnew.length();i++)
			{
				permutations.add(strnew.substring(0,i) + first + strnew.substring(i));
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