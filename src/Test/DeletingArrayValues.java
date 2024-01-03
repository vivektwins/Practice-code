package Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeletingArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,3,5,6,7,9};
		int b[] = new int [a.length-1];
		int j=6;
		
		for (int i=0,k=0;i<a.length;i++)
		{
			if(a[i]!=j)
			{
				b[k]= a[i];
				k++;
			}
			
		}
		System.out.println(Arrays.toString(b));
	}

}
