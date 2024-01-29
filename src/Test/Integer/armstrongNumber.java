package Test.Integer;

public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number=153;
		int armstrong = 153;
		int reverse =0;
		while(number!=0)
		{
			int remainder = number%10;
			number = number/10;
			reverse += Math.pow(remainder, 3);
			
			
		}
		if(reverse == armstrong)
            System.out.println(armstrong + " is an Armstrong number.");
        else
            System.out.println(armstrong + " is not an Armstrong number.");
		
		
	}

}
