package Test.Integer;


public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 1124;
		int number = 1124;
		int reverse =0;
		int multiply =1;
		while(number!=0)
		{
			int remainder = number%10;
			number = number/10;
			reverse+= remainder;
			multiply*= remainder;
			
		}
		
		System.out.println(reverse);
		System.out.println(multiply);

	}

}
