package Test.String;

import java.util.Scanner;

public class MinimumDistanceBetweenStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s[] = {"geeks1", "for", "geeks", "contribute",  "practice"};
		Scanner s1 = new Scanner(System.in);
		String word1 = s1.nextLine();
		
		Scanner s2 = new Scanner(System.in);
		String word2 = s2.nextLine();
		
		int a = 0;
		int b=0;
		
		for(int i=0;i<s.length;i++)
		{
			
			if(s[i].equals(word1))
			{
				
				a=i;
			}
			
			if(s[i].equals(word2))
			{
				b=i;
			}
				
			

		}
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(b-a);
		
		
			
	}

}
