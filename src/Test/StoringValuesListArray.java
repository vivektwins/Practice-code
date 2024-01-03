package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoringValuesListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, List<Integer>> hm = new HashMap();
		List<Integer> l = new ArrayList<Integer>();
		
		int a[] = {1,2,3,4,5,6,7,8,1,9,0};
		
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if(a[i]  == a[j] && i!=j)
				{
				l.add(a[j]);
				System.out.println(Arrays.asList(a[j]));
				}

			}
			hm.put(a[i], l);

		}
		
		for(Map.Entry<Integer,List<Integer>>m: hm.entrySet())
		{
			System.out.println(m.getKey() +"" + m.getValue());
		}
		
	}

}
