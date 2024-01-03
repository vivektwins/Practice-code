package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListIterateOnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,List<Integer>> hm = new HashMap();
		
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		
		
		
		hm.put(1,l);
		hm.put(2, l);
		
		
		
		for(Map.Entry<Integer,List<Integer>>m: hm.entrySet())
		{
			System.out.println(m.getKey() +"" + m.getValue());
		}
		
		

	}

}
