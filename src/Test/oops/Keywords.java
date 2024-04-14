package Test.oops;

public class Keywords extends classA {
	
	
	private String name="ram";

	public String thiskey (String name)
	{
		this.name=name;
	 
		final int a=10;
		 System.out.println(a);
		 super.supe();
	 return name;
	}
	
	public void supe()
	{
		System.out.println("child class");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Keywords key = new Keywords();
		String name= "vivek";
		System.out.println(key.thiskey(name));
		key.supe();
		
		
		

	}

}
