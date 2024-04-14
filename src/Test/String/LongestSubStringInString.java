package Test.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class LongestSubStringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Output: 7 ABCDEFGABEF
Explanation: The longest substring without repeating characters are 
“ABCDEFG”, “BCDEFGA”, and “CDEFGAB” with lengths of 7
*/
		
		/*Input: “GEEKSFORGEEKS”
Output: 7
Explanation: The longest substrings without repeating characters 
“EKSFORG” and “KSFORGE”, with lengths of 7*/
		
		
		String s= "ABCDEFGABEF";
		ArrayList<Character> as = new ArrayList<Character>();
		ArrayList<String> bs = new ArrayList<String>();
		ArrayList<Integer> cs = new ArrayList<Integer>();
		
		Map<String, Integer> m = new TreeMap<>();
		char c[] = s.toCharArray();
		int count=0;
		String temp="";
		int k=0;
		for(int i=0;i<c.length;i++)
		{
			
			for(int j=i;j<c.length;j++)
			{
			
				if(!as.contains(c[j]))
				{
					temp+=String.valueOf(c[j]);
					as.add(c[j]);
					
				}
				
			}
			bs.add(temp);
			m.put(temp,temp.length());
			temp="";
			as.clear();
			
		}
		System.out.println(m);
		
		cs.addAll(m.values());
		Collections.sort(cs);
		
		for(Map.Entry<String, Integer> hm: m.entrySet())
		{
			
			
			if(cs.get(cs.size()-1)==hm.getValue())
			{
			
				System.out.println(hm.getKey() + " " +hm.getValue());
			
			}
		}

	}

}
