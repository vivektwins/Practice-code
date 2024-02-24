package Test.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllPermutationsofABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="abc";
		char c[] = s.toCharArray();
		Set<String> as = new HashSet<String>();
		String temp ="";
		as.add(" ");
		for(int i=0;i<c.length;i++)
		{
			Arrays.sort(c);
			String a = String.valueOf(c[i]);
			
				
			for(int j=0;j<c.length;j++)
			{
				Arrays.sort(c);
				String b = String.valueOf(c[j]);
				
			
			
			for(int k=0;k<c.length;k++)
			{
				Arrays.sort(c);
				String C = String.valueOf(c[k]);
				String sort = String.valueOf(c);
				

				String temp3= a+b+C;
				
				System.out.println(sort  + " - " + temp3);
				
                if(a.contains(temp3) && b.contains(temp3) && C.contains(temp3))
                {
                	System.out.println(temp3);
                }
			
				
				if(!as.contains(temp3))
				{
					
				as.add(temp3);
				}
			
			}
			
				}
			
		}

		
		System.out.println(as);
	}

}
