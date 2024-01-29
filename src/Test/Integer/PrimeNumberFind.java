package Test.Integer;

public class PrimeNumberFind {
	
	public static void main(String args[])
	{
		int a= 23;
		
			int count =0;
			for(int i=2;i<=Math.sqrt(a);i++)
			{
				if(a%i==0)
				{
					//System.out.println("Not a prime number" + a);
					count++;
				}
				
			}
			if(count==0)
			
			{
				System.out.println("prime number" + a);
			}
		
	}

}
