package Test.Integer;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveLast2DigitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6};
		int k=2;
		int b[] = new int[a.length-k];
		System.out.println(Arrays.toString(b));
		
		ArrayList<Integer> as = new ArrayList<>();
		ArrayList<Integer> bs = new ArrayList<>();
		
		for(int i=0;i<b.length;i++)
		{
			as.add(a[i]);
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(!as.contains(a[i]))
			{
				bs.add(a[i]);
			}
		}
		
		bs.addAll(as);
		

		System.out.println(bs);
		

	}

}
