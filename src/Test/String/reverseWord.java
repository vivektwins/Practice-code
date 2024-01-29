package Test.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello how are you";
		String arr[] = s.split("\\s");
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			
		}
		

	
	int number = 12345;
	int reverse =0;
	
	while(number!=0)
	{
     int remainder = number%10;
     number = number/10;
     reverse = reverse*10+remainder;
	}
	System.out.println(reverse);
	
	ArrayList<Character> as= new ArrayList<Character>();
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	
	String ab = "aabbssddeef";
	
	char c[] = ab.toCharArray();
	Arrays.sort(c);
	int count=0; 
	for(int i=0;i<c.length;i++)
	{
		count=0;
		if(!as.contains(c[i]))
		{
		for(int j=0;j<c.length;j++)
		{
			if(c[i]==c[j])
			{
				
				as.add(c[j]);
				count++;
				hm.put(c[j], count);
				//System.out.println(c[j] +"-" + count);
			}
		}
		}
	}
	for(Map.Entry<Character,Integer> m: hm.entrySet() )
	{
		
			System.out.println(m.getKey() +" " + m.getValue());
		
	}
	
	}
}
	
//	public void setUp() {
//	
//	RestAssured.BaseUri = "https://jsonplaceholder.typicode.com";
//	
//	}
//	
//	public void getRequest()
//	{
//		Response response = given().contentType(ContentType.JSON).when().get("/posts").then.extract().response();
//		
//		Assertion.assertEquals(200,response.getStatusCode());
//		Assertion.assertEquals("text",response.jsonPath().getString("text"));
//		
//		Response response = given().contentType(ContentType.JSON).param("a","n").when().get("/posts").then.extract().response();
//		Response response = given().header("ContentType","application/json").and.body("text").when().post("/post").then.extract().response();
//				
//	}
//}
	


