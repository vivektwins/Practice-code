package Test.Character;

import java.util.ArrayList;
import java.util.Arrays;

public class CharactersSortAndFindArranging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="gabdef";
		ArrayList<String> as = new ArrayList<String>();
		char c[] = s.toCharArray();
		
		char c1[] = s.toCharArray();
		
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=1;j<c.length;j++)	
			{
				
				//System.out.println(c[i]);
				if(c[i]<c[j])
				{
					
					count++;
					//break;
				}
				else
				{
				
				count=0;
				break;
				}
				//break;
			}
			break;
		}
	
		if(count>0)
		{
			System.out.println("Sequence");
		}
		else
		{
			System.out.println("Not in sequence");
		}
		
		Arrays.sort(c);
		
		System.out.println(Arrays.equals(c, c1));
		
		
		
     
	}
	
	
	

}
