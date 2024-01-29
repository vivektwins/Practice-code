package Test.oops;

class StaticTest {

	int a=10;
	
	
	public static void method()
	{
		System.out.println("static method");
		
	}
	
	static 
	{
		int a=10;
		System.out.println("static block");
		
	}
	public StaticTest() {
		// TODO Auto-generated constructor stub
		
		System.out.println("constructor block");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       		
		StaticTest s = new StaticTest();
		System.out.println("main method");
		StaticTest.method();
		
		
		
		
		

	}

}
