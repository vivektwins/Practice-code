package Test.Integer;

import java.util.ArrayList;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ArrayList<Integer> cs = new ArrayList<Integer>();
		ArrayList<Integer> bs = new ArrayList<Integer>();
		int a1[]= {1,2,3,4,5,6,7};
		int n= a1.length;
		int k=3;
		
		if(k<=n)
		{
        for(int i=0;i<n-k;i++)
        {
        	System.out.println(a1[i]);
        	cs.add(a1[i]);
        	
        }
        for(int i=0;i<n;i++)
        {
		
        	if(!cs.contains(a1[i]))
        	{
        		bs.add(a1[i]);
        	}
        }
		}
        bs.addAll(cs);
		System.out.println(bs);

	}

}
