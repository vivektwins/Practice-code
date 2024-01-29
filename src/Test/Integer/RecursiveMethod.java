package Test.Integer;

public class RecursiveMethod {
	
	public static int recursive(int number) {
		
		int reverse=0,remainder=0;
		
		while(number!=0)
		{
		remainder = number%10;
		number =number/10;
		reverse+=remainder;
		
		}
		
		
		return reverse;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,1,1,4,3,100,1000};
		int number =0;
		
		for(int i=0;i<a.length;i++)
		{
			number+=a[i];
		}
	     if(number>=10)
		{
	    	 int b=recursive(number);
	    	 
			if(b>10)
			{
				
				System.out.println(recursive(b));
			}
			else
			{
				System.out.println(b);
			}
			
			
		}
	     else
	     {
	    	 System.out.println(number);
	     }
	     
		
	}

}
