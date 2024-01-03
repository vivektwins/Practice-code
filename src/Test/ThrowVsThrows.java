package Test;

public class ThrowVsThrows {
	
	
	public void test() throws InterruptedException, NullPointerException
	{
	try {
		Thread.sleep(1000);
		int a = (Integer) null;
	} catch (NullPointerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("coming here");
		System.out.println(e.getMessage());

		
	}
	finally
	{
		System.out.println("finally");
		throw new RuntimeException();
	}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThrowVsThrows t = new ThrowVsThrows();
		t.test();

		
	}

}
