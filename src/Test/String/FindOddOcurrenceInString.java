package Test.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindOddOcurrenceInString {
	
	private static ArrayList<Character> as = new ArrayList<Character>();
	static Map<Character, Integer> m = new TreeMap<Character,Integer>();
	
	public static boolean oddOccurence(String str)
	{
		
		String s = str;
		int count =0;
		m.clear();
		char c[]=s.toCharArray();
		Arrays.sort(c);		
		for(int i=0;i<c.length;i++)
		{
			count=0;
			if(c.length==1)
			{
				return true;
			}
			

			
			if(!as.contains(c[i]))
			{
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					m.put(c[i], count);
				}
			}
			
			}
		}
		
		//Collection<Integer> n = m.values();
		
		
		count =0;
		for(Map.Entry<Character,Integer> hm : m.entrySet())
		{
		 
			int n =hm.getValue();
			int w = n%2;
			System.out.println(n);
			System.out.println(hm.getKey());
			//System.out.println(w);
			//System.out.println(str + " " + n);
			
			
			if(n%2!=0)
			{
				
				return true;
			}
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(FindOddOcurrenceInString.oddOccurence("aabbb")); // Output should be true
        System.out.println(FindOddOcurrenceInString.oddOccurence("ba"));    // Output should be false
        System.out.println(FindOddOcurrenceInString.oddOccurence("aaa"));   // Output should be true
        System.out.println(FindOddOcurrenceInString.oddOccurence("b"));     // Output should be true
        System.out.println(FindOddOcurrenceInString.oddOccurence("abba")); // Output should be false

	}

}
