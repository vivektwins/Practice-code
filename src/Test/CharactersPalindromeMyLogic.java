package Test;

import java.util.HashSet;
import java.util.Set;

import org.checkerframework.checker.units.qual.Length;

public class CharactersPalindromeMyLogic {
	
	public static Set<String> getPermutations(String str)
	{
		Set<String> permutations = new HashSet<String>();
		
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
		Set<String> s = getPermutations(sub);
		for(String words: s)
		{
			for(int i=0;i<=words.length();i++)
			{
				permutations.add(words.substring(0,i)+first+words.substring(i));
			}
		}
		
		return permutations;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "malayalam";
		Set<String> permutations = new HashSet<String>();
		permutations.addAll(CharactersPalindromeMyLogic.getPermutations(s));
		System.out.println(permutations);
		
		for(String s1 : permutations)
		{
			StringBuilder bs = new StringBuilder(s1);
			bs.reverse();

			char c[] = s1.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(c[i]==c[c.length-1])
				{
					//System.out.println(c[i] + " " +c[c.length-1] );
				  if(bs.toString().equals(s1))
				  {  
					System.out.println(bs + " " + "It's a palindrome");
					break;
				  	}
				}
//				else
//				{
//					System.out.println(s1 + " " +"Not a palindrome");
//					break;
//				}
//				
			}
		}
		
		
		

	}

}
