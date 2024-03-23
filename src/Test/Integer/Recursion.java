package Test.Integer;


public class Recursion {

	public static void recurse(int a)
    {
    	
    	System.out.println("coming here");
    	
    	for(int i=0;i<=a;i++)
    	{
    		System.out.println(i);
    		if(i==a)
    		{
    			a--;	
    			
    		recurse(a);
    		
    		}
    	}
    	
    }
	public static void rec(int number)
	{
		int reverse =0;
		while(number!=0)
		{
			int remainder = number%10;
			number = number/10;
			reverse+= remainder; 
		}
		
		System.out.println(reverse);
		if(reverse>=10)
		{
		rec(reverse);
		}
	}
	

	public static void main(String[] args){
		
		rec(87654321);

		recurse(10);
	}

}
