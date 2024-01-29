package Test;

public class nullCheck {
	
	public static void a(String str)
	{
		System.out.println(str);
	}
	public static void a(Object o)
	{
		System.out.println(o);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object s = null;
		nullCheck.a(s);
		

	}

}
