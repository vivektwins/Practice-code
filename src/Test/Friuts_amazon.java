package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Friuts_amazon {

	public static void main(String[] args) {
		
		
		int a[] = {1,3,6,7,8,3};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		ArrayList<Integer> as = new ArrayList();
		for(int i=0;i<a.length-1;i++)
		{
			
			for(int j=0;j<a.length-1;j++)
			{
			
				if(a[i]!=a[j])
				{
					if(i==a.length-1)
					{
						System.out.println(a[j]);
					}
					if(!as.contains(a[i]) && !as.contains(a[j])) 
					{
						
						
						{
				hm.put(a[i],a[j]);
				as.add(a[i]);
				as.add(a[j]);
				
						}
						break;
					}
				}
			 }
			
			System.out.println(as +" "+ i);
			
		}
			
		
		
		for(Entry<Integer,Integer> m: hm.entrySet())
		{
			System.out.println(m);
		}
		// TODO Auto-generated method stub

	}

}
