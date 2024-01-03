package Test;

import java.util.ArrayList;

public class ReverseSpecialCharactersWithoutIndexChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "test!@rt56&*io";
		char c[] = s.toCharArray();
		Character c1[] = new Character[c.length];
		
		ArrayList<Character> as = new ArrayList();
		
		for(int i=0;i<c.length;i++)
		{
			if(!Character.isAlphabetic(c[i]) &&
					!Character.isDigit(c[i]))
			{
				c1[i]=c[i];
				//System.out.print(c1[i]);
			}
			
		}
		for(int j=c.length-1;j>=0;j--)
		{
			if(Character.isAlphabetic(c[j]) ||
					Character.isDigit(c[j]))
			{
				for(int k=0;k<c.length;k++)
				{
					if(c1[k]==null)
					{
						c1[k]=c[j];
						break;
					}
				}
			}
		}
			
			
		
		
		for(int k=0;k<c1.length;k++)
		{
			System.out.print(c1[k]);
		}
		
		
		
	}

}
