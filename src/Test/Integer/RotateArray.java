package Test.Integer;

import java.util.ArrayList;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		ArrayList<Integer> as = new ArrayList<Integer>();
		as.add(a.length);
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length)
			{
			as.add(a[i]);
			break;
			}
		}
		for(int j=0;j<a.length;j++)
		{
			if(j!=a.length-1)
			{
				as.add(a[j]);
			}
		}
		
		System.out.println(as);

	}

}
