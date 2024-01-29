package Test.Integer;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n3=0,n1=0,n2=1;
		
		System.out.print(n1 + " " + n2);
		
		for(int i=2;i<20;i++)
		{
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print( " " +n3);
			
			
					
		}
		
	}

}
