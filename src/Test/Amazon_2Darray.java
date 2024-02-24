package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Amazon_2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[][]= {{'A','B','B'},{'P','P','L'},{'E','L','U'},{'B','P','E'}}; //4+5+6 8+10+12
		System.out.println(Arrays.deepToString(a));
		
		ArrayList<Character> as = new ArrayList<Character>();
        int n= a.length*3;		
		
		for(int i=0;i<a.length-1;i++)
		{
			
			int j=0,k=0,l=0;
			as.add(a[i][j]);
			as.add(a[j][i]);
			as.add(a[k][i]);
			as.add(a[l][i]);
			j++;
			k++;
			l++;
		}
			
//			if(a[i][i]=='A' || a[i][i]== 'P' ||a[i][i]== 'P' || a[i][i]== 'L' || a[i][i]== 'E')
//			{
//				if(!as.contains(a[i][i]))
//				{
//					as.add(a[i][i]);
//				}
//			}
		
		
		System.out.println(as);

	}

}
