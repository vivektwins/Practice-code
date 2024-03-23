package Test.Integer;

import java.util.Arrays;

public class Insert1ElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,3,4,3,2,5,6,7};
		int b[] = new int[a.length+1];
		int n=4;
		for(int i=0,k=0;i<a.length;i++)
		{
			if(n==i)
			{
				
				b[i]=n;
			    b[i+1]= a[i];
			    k=i+2;
			    

				
			}
			else
			{
				
				b[k]=a[i];
				k++;
			}
			
		}
		System.out.println(Arrays.toString(b));
		
	}

}
