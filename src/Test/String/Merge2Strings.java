package Test.String;

import java.util.ArrayList;

public class Merge2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a= "efg";
		String b = "abcsd";
		
		char c[] = a.toCharArray();
		char d[] = b.toCharArray();
		ArrayList<Character> as = new ArrayList<Character>();
		
		String f = a+b;
		String e = a.concat(b);
		System.out.println(f);
		
		for(int i=0;i<d.length;i++)
		{
			as.add(d[i]);
			if(c.length>i)
            {
            as.add(c[i]);
            }
            
			
		}
		System.out.println(as);
				
	}

}
