package Test.String;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupOfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String anagram [] = {"cat", "act", "tea", "eat", "man"};
		
		System.out.println(anagram.length);
		
		String temp="";
		
	
		ArrayList<String> as = new ArrayList<String>();

		ArrayList<String> bs = new ArrayList<String>();

		for(int i=0;i<anagram.length;i++)	
		{
		    char c[] = anagram[i].toCharArray();
			Arrays.sort(c);
			
			System.out.println(c);
			temp ="";
			for(int j=0;j<c.length;j++)
			{
				
				temp +=String.valueOf(c[j]);
				
				
			}
			as.add(temp);
								
		}
		
		
		
		for(int i=0;i<as.size();i++)
		{
			
			
			for(int j=0;j<as.size();j++)
			{
				if(as.get(i).equals(as.get(j)) && i!=j)
				{
					System.out.println(anagram[i] + "- "+ "Anagram");
					bs.add(as.get(i));
					break;
				}
				
			}
			
		}
		
		System.out.println(bs);
		
		for(int i=0;i<as.size();i++)
		{
			if(!bs.contains(as.get(i)))
			{
				System.out.println(anagram[i]);
			}
		}
			
			
			
			
		

	}

}
