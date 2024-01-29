package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class test {
	
	public static Set<String> getPermutations(String str)
	{
		Set<String> permutations = new HashSet<String>();
		if(str==null)
		{
			return permutations;
		}
		if(str.length()==0)
		{
			permutations.add("");
			return permutations;
		}
		
		char first = str.charAt(0);
		String word = str.substring(1);
		Set<String> set = getPermutations(word);
		for(String s: set)
		{
			for(int i=0;i<=s.length();i++)
			{
				permutations.add(s.substring(0,i)+first+s.substring(i));
			}
		}
		return permutations;
	}
	
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "ABC";
		System.out.println(getPermutations(s));
		ArrayList<Character> a2 = new ArrayList<Character>();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		
		String s1 ="aaabbcccddde";
		char c[] = s1.toCharArray();
		int count1 =0;
		
		for(int i=0;i<c.length;i++)
		{
			if(!a2.contains(c[i]))
			{
				count1=0;
			for(int j=0;j<c.length;j++)
			{
			     if(c[i]==c[j])
			     {
			    	 count1++;
			    	 m.put(c[i],count1);
			    	 a2.add(c[i]);
			     }
			}
			}
		}
		
		for(Map.Entry<Character,Integer> hm: m.entrySet())
		{
			System.out.println(hm.getKey() + " " +hm.getValue());
		}
		
//		String s ="ABC";
//		String temp ="";
//		char character =' ';
//		
//		//System.out.println();
//		
//		Set<String> set1 = new LinkedHashSet();
//		set1.addAll(getPermutations(s));
//		
//		System.out.println(set1);
//		
//		
//		
//		
//		
//		char ch[]= s.toCharArray(); 
//		Set<Character> set = new HashSet<Character>();
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			temp+= String.valueOf(ch[i]);
//			set.add(ch[i]);
//			
//			
//			
//		}
//
//		
//		
//		System.out.println(character);
//		set.add(character);
//		System.out.println(set);
		
		
		Stack<String> a = new Stack();
		a.push("a");
		a.push("b");
		a.push("c");
		a.push("d");
		a.push("e");
		int a1[] = {1,2,3,4,5,6,7};
		for(int i=0;i<a1.length;i++)
		{
			if(i!=a1.length-1)
			{
			if(a1[i]!=a1[i+1])
			{
				System.out.println(a1[i+1]);
			}
			}
		}
		
		
		ArrayList<Integer> as = new ArrayList<Integer>();
	
		for(int n=1;n<=100;n++)
		{
			int count =0;
			for(int i=1;i<=n;i++)
			
				if(n%i==0)
					count++;
				 if(count==2)
					as.add(n);
					
			   
			}
		
		System.out.println(as);
		
		int b =15;
		int count =0;
		for(int i=2;i<Math.sqrt(b);i++)
		{
		if(b%i==0)
		{
			count ++;
		}
		}
		if(count==0)
			
		{
			System.out.println("prime number" + b);
		}
		}
	
	
	
			
			
  
	}


