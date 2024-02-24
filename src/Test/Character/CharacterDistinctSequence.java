package Test.Character;

import java.util.HashSet;
import java.util.Set;

public class CharacterDistinctSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x = "gfg";
		char c[]= x.toCharArray();
		Set<String> as = new HashSet<String>();

		as.add("");
		for(int i=0;i<c.length;i++)
		{
			String a = String.valueOf(c[i]);
			if(i==0)
			{
				a = String.valueOf(c[i]);
				String b = String.valueOf(c[i+1]);
				String C = String.valueOf(c[i+2]);
				as.add(a+b+C);
			}
			as.add(a);
			if(i==c.length-2)
			{
				a = String.valueOf(c[i]);
				String b = String.valueOf(c[i+1]);
				as.add(a+b);
			}
			if(i==c.length-3)
			{
				a = String.valueOf(c[i]);
				String b = String.valueOf(c[i+1]);
				as.add(a+b);
			}
			
			if(i==c.length-1)
			{
				a = String.valueOf(c[i]);
				String b = String.valueOf(c[i-2]);
				as.add(a+b);
			}
			
		}
		
		System.out.println(as);

	}

}
