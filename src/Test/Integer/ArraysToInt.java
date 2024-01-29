package Test.Integer;

import java.util.Arrays;

public class ArraysToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		int b=0;
		String number ="";
		for(int i=0;i<a.length;i++)
		{
		
			b+=a[i];
			number+=String.valueOf(a[i]);
		}
		System.out.println(number);
		System.out.println(b);
  
		
		char c[] = {'a','b','c','d','e'};
		String s="";
		for(int i=0;i<c.length;i++)
		{
			s+= String.valueOf(c[i]);
			
		}
		System.out.println(s);
		
		String s1 = "abcd";
		
		
		char c1[] =s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
