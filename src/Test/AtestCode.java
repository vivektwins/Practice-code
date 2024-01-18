package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AtestCode {
	
//	public static Set<String> getPermutations(String str)
//	{
//		Set<String> permuatations = new HashSet<String>();
//		
//		if(str==null)
//		{
//			return permuatations;
//		}
//		else if(str.length()==0)
//		{
//			permuatations.add("");
//			return permuatations;
//			
//		}
//		
//		char first = str.charAt(0);
//		String s = str.substring(1);
//		Set<String> s1 = getPermutations(s);
//		for(String s2: s1)
//		{
//			for(int i=0;i<=s2.length();i++)
//			{
//				permuatations.add(s2.substring(0,i) + first + s2.substring(i));
//			}
//		}
//		
//		return permuatations;
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s= "abcd";
//		System.out.println(AtestCode.getPermutations(s));
////		
//		int number= 12345;
//		int reverse =0;
//		while(number!=0)
//		{
//			int remainder = number%10;
//			reverse = reverse*10+remainder;
//			number = number/10;
//		}
//		
//		System.out.println(reverse);
//		
//		number= 12345;
//		while(number!=0)
//		{
//			int remainder = number%10;
//			number = number/10;
//			reverse+= remainder;
//		}
//		
//		System.out.println(reverse);
//		
//		
//		ArrayList<Integer> as = new ArrayList<Integer>();
//		
//		for(int n=1;n<=100;n++)
//		{
//			int c=0;
//			for(int i=1;i<=100;i++)
//			if(n%i==0)
//				c++;
//			if(c==2)
//				as.add(n);
//				
//			
//		}
//		System.out.println(as);
		
//		int a = 153;
//		number =153;
//		while(number!=0)
//		{
//			int remainder = number%10;
//			number = number/10;
//			reverse+= Math.pow(remainder, 3);
//		}
//		
//		System.out.println(reverse);
		
		
//		ArrayList<Character> as = new ArrayList<Character>();
//		
//		Map<Character, Integer> m = new HashMap();
//		String a1 = "aabbccdde";
//		char c [] = a1.toCharArray();
//		
//		for(int i=0;i<c.length;i++)
//		{
//			int count =0;
//			if(!as.contains(c[i]))
//			for(int j=0;j<c.length;j++)
//			{
//				if(c[i]==c[j])
//				{
//					count++;
//					m.put(c[i], count);
//					
//					
//				}
//			}
//		}
//		
//		for(Map.Entry<Character, Integer> hm: m.entrySet())
//		{
//			System.out.println(hm.getKey() + " " + hm.getValue());
//			
//			if(hm.getValue()!=1)
//			{
//				System.out.println(hm.getKey() + " " + hm.getValue());
//			}
//		}
		
		String a1 = "test@#%ui*op";
		char c [] = a1.toCharArray();
		Character c1[] = new Character[c.length];
		for(int i=0;i<c.length;i++)
		{
			if(!Character.isAlphabetic(c[i]) && !Character.isDigit(c[i]))
			{
				c1[i] =c[i];
			}
		}
		System.out.println(Arrays.toString(c1));
		
		for(int i=c.length-1;i>=0;i--)
		{
			if(Character.isAlphabetic(c[i]) || Character.isDigit(c[i]))
			{
				for(int k=0;k<c.length;k++)
				{
					if(c1[k]==null)
					{
						c1[k]= c[i];
						break;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(c1));
		
		
		int a=25;
		int count =0;
		
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("prime number" + " " + a);
		}
		else
		{
			System.out.println("Not a prime number" + " " + a);
			
		}

	}

}
