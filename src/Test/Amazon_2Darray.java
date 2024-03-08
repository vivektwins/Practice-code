package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Amazon_2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[][]= {{'A','B','B', 'P'},{'P','L','E','L'},{'U','B','P','E'}}; //4+5+6 8+10+12
		System.out.println(a.length);
		System.out.println(Arrays.deepToString(a));
		
		ArrayList<Character> as = new ArrayList<Character>();
        int n= a.length*3;	
        String temp="";
		
        
        
		for(int i=0;i<=a.length-1;i++)
		{
			
			for(int j=0;j<=a[i].length-1;j++)
				
			{
				
					System.out.print(a[i][j]);
					System.out.println();
					if(a[i][j]=='A' || a[i][j]== 'P' || a[i][j]== 'L' || a[i][j]== 'E')
					{
						
						
						if(temp.equals("APPLE"))
						{
							break;
						}
						else
						{
							temp+= String.valueOf(a[i][j]);
						}
						
					
						
					}
					
			}
			
			
		}
		
		System.out.println(temp);

	}

}
