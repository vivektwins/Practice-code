package Test.Integer;

import java.util.Arrays;

public class Merge2Arraysinto1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArray = {56,78,90,32,67,12}; //initialized array  
    	int[] secondArray = {11,14,9,5,2,23,15,17};
    	int a= firstArray.length;
    	int b=secondArray.length;
    	int c[] = new int[a+b];
    	int n=0;
    	int k=0;
    	
    	for(int i=0;i<firstArray.length;i++)
    	{
    		c[i]= firstArray[i];
    		n=i;
    		
    	}
    	n=n+1;
    	for(int j=n;j<c.length;j++)
    	{
    		
    		
    			c[j]=secondArray[k];
    			k++;
    		
    	}
    	
    	System.out.println(Arrays.toString(c));

	}

}
