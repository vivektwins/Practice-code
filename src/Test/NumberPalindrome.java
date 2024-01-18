package Test;

public class NumberPalindrome extends permutations{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 53435;
		int actual= 53435;
		int reverse =0;
		 while(number!=0)
		 {
			 int remainder = number%10;
			 reverse = reverse *10+ remainder;
			 number = number/10;
			 
			 
		 }

		 System.out.println(actual + reverse);
		 
		 if(actual == reverse)
		 {
			 System.out.println("Palindrome " + reverse);
		 }
		 else
		 {
		 System.out.println("Not a palindrome " +reverse);
		 }
	}

}
