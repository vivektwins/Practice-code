package Test;

public class WithOutBracesForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("with braces " + a[i]);
		}
		for(int i=0;i<a.length;i++)
		  System.out.print("with out braces " + a[i] +" ");
		
	}

}
