package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello how are you";
		String arr[] = s.split("\\s");
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			
		}
		

	
	int number = 12345;
	int reverse =0;
	
	while(number!=0)
	{
     int remainder = number%10;
     reverse = reverse*10+remainder;
     number = number/10;
	}
	System.out.println(reverse);
	
	ArrayList<Character> as= new ArrayList<Character>();
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	
	String ab = "aabbssddeef";
	
	char c[] = ab.toCharArray();
	Arrays.sort(c);
	int count=0; 
	for(int i=0;i<c.length;i++)
	{
		count=0;
		if(!as.contains(c[i]))
		{
		for(int j=0;j<c.length;j++)
		{
			if(c[i]==c[j])
			{
				
				as.add(c[j]);
				count++;
				hm.put(c[j], count);
				//System.out.println(c[j] +"-" + count);
			}
		}
		}
	}
	for(Map.Entry<Character,Integer> m: hm.entrySet() )
	{
		
			System.out.println(m.getKey() +" " + m.getValue());
		
	}
	
	}
}
	


