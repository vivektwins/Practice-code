package Test;

public class swap2numbersWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y=10;
		
		System.out.println("before swap" + x + " " +y);
		 x= x+y;  //5 +10 = x=15
		 y= x-y;  // 15 -10 = y =5
		 x = x-y; // 15 -5 = x= 10 
		 
		 System.out.println("after swap" + x + " " +y);

	}

}
