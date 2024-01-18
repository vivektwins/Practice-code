package Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class test {
	
	public static Set<String> getPermutations(String str)
	{
		Set<String> Permutations = new HashSet<String>();
		if(str==null)
		{
			return null;
		}
		else if(str.length()==0)
		{
			Permutations.add("");
			return Permutations;
		}
		
		char first = str.charAt(0);
		String sub = str.substring(1);
		Set<String> s3= getPermutations(sub);
		for(String loop: s3)
		{
			for(int i=0;i<=loop.length();i++)
			{
				Permutations.add(loop.substring(0,i) + first + loop.substring(i));
			}
		}
		return Permutations;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="ABC";
		String temp ="";
		char character =' ';
		
		//System.out.println();
		
		Set<String> set1 = new LinkedHashSet();
		set1.addAll(getPermutations(s));
		
		System.out.println(set1);
		
		
		
		char ch[]= s.toCharArray(); 
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0;i<ch.length;i++)
		{
			temp+= String.valueOf(ch[i]);
			set.add(ch[i]);
			
			
			
		}

		
		
		System.out.println(character);
		set.add(character);
		System.out.println(set);
	}
	

}
