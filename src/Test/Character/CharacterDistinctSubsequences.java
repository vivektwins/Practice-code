package Test.Character;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CharacterDistinctSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="abc";
		char c[] = s.toCharArray();
		Set<String> as = new HashSet<String>();
		String temp ="";
		as.add(" ");
		for(int i=0;i<c.length;i++)
		{
			String b = String.valueOf(c[i]);
			temp+= b;
				if(!as.contains(b))
				{
				as.add(b);
				}
				if(!as.contains(temp))
				{
				as.add(temp);
			for(int j=0;j<c.length;j++)
			{
				temp+= c[i]+c[j];
				if(!as.contains(temp))
				{
				as.add(temp);
				}
			}
			}
			
		}

		
		System.out.println(as);
	}

}
