package Test.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MissingNumber_Mylogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> as = new ArrayList<Integer>();
		int b[] ={0,1,92,4,5,6,7,8, 20};
		int a[] = new int[b.length];
		Arrays.sort(b);
		int n=0;
		
		
		
		for (int i=b.length-1;i>0;i--)
		{
		    
		    
		    n= b[i];
		    
		    break;
		}
		System.out.println(n);
		for(int i=0;i<b.length;i++)
		{
		    as.add(b[i]);
		    
		}
	     
	     for(int i=0;i<n;i++)
		{
		    if(!as.contains(i))
		    {
		        System.out.println(i);
		    }
		    
		}
		
		}

	}