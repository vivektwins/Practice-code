package Test.Integer;

import java.util.HashMap;
import java.util.Map;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Character, Integer> m = new HashMap();
		
		m.put('a', 4);
		m.put('b', 1);
		m.put('a', 2);
		m.put('c', 1);
		
		System.out.println(m.keySet() + " " + m.values());
		
		
		
		m.remove('a');
		
		System.out.println(m.keySet() + " " + m.values());
		
		int fact =1;
		
		for(int i=1;i<6;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}

		
	}

}
