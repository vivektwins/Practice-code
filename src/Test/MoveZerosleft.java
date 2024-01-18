package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,1,3,0,0,6,7,0};
		
		ArrayList<Integer> as = new ArrayList<>();
		ArrayList<Integer> bs = new ArrayList<>();
		
		//Left logic
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				as.add(a[i]);
			}
			
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(!as.contains(a[i]))
			{
				as.add(a[i]);
			}
			
			
		}
		
		
		System.out.println(as);
		
		
		//Right logic
		
		
		as.clear();
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				as.add(a[i]);
			}
			else
			{
				bs.add(a[i]);
			}
			
			
		}
		as.addAll(bs);
		
		System.out.println(as);


	}

}
