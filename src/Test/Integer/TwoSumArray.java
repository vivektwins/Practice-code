package Test.Integer;

import java.util.ArrayList;

public class TwoSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,5};
		int x=6;

		ArrayList<Integer> as = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!as.contains(i))
			{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==x && i!=j)
				{
					System.out.println(i+" " +j);
					as.add(i);
					as.add(j);
					break;
					
				}
			}
			}
		}
		
		System.out.println(as);
	}

}
