package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class aaafind3aAndRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "aabbaaaacddeeeebb";
		char c[] = a.toCharArray();
		Stack<Character> s = new Stack<Character>();
		ArrayList<Character> as = new ArrayList();
		Map<Character, Integer> map1 = new HashMap();
		Map<Character, Integer> map2 = new HashMap();
		
		String temp = "";
		boolean check =false;
		
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			if(!as.contains(c[i]))
			{
			for(int j=0;j<c.length;j++)
			{
				
				
				if(c[i]==c[j])
				{
					count++;
					
					as.add(c[i]);
					if(count<=2)
					{
						check = true;
						
						continue;	
						
					}
					else if(count>=3)
					{
						map2.put(c[i], count);
						check = false;
					}
				
					
				}
				else
				{	

					if(check==true )
					{
						//temp=c[i]+temp+"";
						map1.put(c[i], count);
					}
					
					check =false;
					
					count=0;
				}
				
				
			}
			if(check==true)
			{
				map1.put(c[i], count);
			}
			
			}
		}
		   	
		//System.out.print(temp);
		System.out.print(map1.keySet() + " " + map1.values());
		
		for(Map.Entry<Character,Integer> m : map1.entrySet())
		{
			
		      for(int i=0;i<m.getValue();i++)
		      {
		    	  temp = temp+m.getKey()+"";
		      }
		      
		      
		}
		System.out.print(map2.keySet() + " " + map2.values());
		System.out.print(temp);
			
//			if(i!=c.length-1)
//			{
//			x`
//				if(c[i]==c[i+1])
//				{
//					
//				}
//			}
			
//		s.push(c[i]);
//		}
//		
//		Iterator<Character> it = s.iterator();
//		
//		while(it.hasNext())
//		{
//			if(it.hasNext().equals('a'))
//			
//			System.out.println(it.next());
//		}
		

		}

}
