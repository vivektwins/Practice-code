package Test.oops;

public class copyconstructor {
	
	public copyconstructor(int a, int b) {
		
		System.out.println(a +" " +b);
	}
	
	public copyconstructor(copyconstructor c1)
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		copyconstructor c = new copyconstructor(10,20);
		copyconstructor c2 = new copyconstructor(c);
		
		

	}

}
