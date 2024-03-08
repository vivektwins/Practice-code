package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputForAllDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers " + s.nextInt());
		//int n = s.nextInt();
		
		
		System.out.println("Enter string " + s.nextLine());
	    
		
		System.out.println("Enter character " + s.next().charAt(0));
		//char c = s.next().charAt(0);
		
		System.out.println("Enter ArrayValues ");
		int num = s.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter List values ");
		ArrayList<String> as = new ArrayList<String>();
		while(s.hasNext())
		{
			String sq = s.nextLine();
			as.add(sq);
		}
		s.close();
		System.out.println(as);
	}

}
