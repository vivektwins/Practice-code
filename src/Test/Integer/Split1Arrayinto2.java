package Test.Integer;

import java.util.ArrayList;
import java.util.Arrays;

public class Split1Arrayinto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int k=3;
		ArrayList<Integer> as = new ArrayList<>();
		ArrayList<Integer> bs = new ArrayList<>();
	    
		for(int i=0;i<a.length;i++)
		{
			if(i<k)
			{
				as.add(a[i]);
			}
			
		}

		for(int i=0;i<a.length;i++)
		{
			if(!as.contains(a[i]))
			{
				bs.add(a[i]);
			}
		
		}
		System.out.println(as);
		System.out.println(bs);

	}

}
