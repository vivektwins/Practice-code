package Test;

import java.util.ArrayList;


public class TestApi {
	

	String name;
	int id ;
	String salary;
	
	public String setname(String name)
	{
		this.name = name;
		return name;
	}
	
	public String getname()
	{
		return name;
	}
	
	public int getid()
	{
	return id;	
	}
	
	
	
	
	
	public static void main (String args[])
	{
//		RestAsurred.BaseUri = "https://google.com/";
//		String data = "";
//		
//		Response response = given().
//				header("content-type", "application/json")
//		        .header("BearerToken", "")
//		        .and()
//		        .body(data)
//		        
		
		//23243 module1
		
		String s = "Testing for 23243 module1 in automation";
//		char c[] = s.toCharArray();
//		
//		for(int i=0;i<c.length;i++)
//		{
//			if(Character.isDigit(c[i]))
//			{
//				System.out.print(c[i]);
//			}
//		}
		
		ArrayList<String> as = new ArrayList<String>();
		
		String split[] = s.split("\\s");
		for(int i=0;i<split.length;i++)
		{
			char c1[] = split[i].toCharArray();
			
			//System.out.println(split[i]);
			
			for(int j=0;j<c1.length;j++)
			{
				
				if(Character.isDigit(c1[j]))
				{
					if(!as.contains(split[i]))
					{
					as.add(split[i]);
					//System.out.println(split[i]);
					}
				
				}
			}
			
		}
		
		
		System.out.println(as);
		
		
	
		
		
	}

}
