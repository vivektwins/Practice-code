package Test;
import org.json.JSONArray;
import org.json.JSONObject;

public class fetchNestedJSONfromArray {

    static String json = ""
 + "["
 + " {"
 + "     \"id\": 1,"
 + "     \"empid\": \"12345\","
 + "     \"details\": {"
 + "         \"name\": \"xyz\","
 + "         \"age\": \"30\","
 + "         \"sex\": \"M\","
 + "         \"Address\": {"
 + "             \"Office\": \"office\","
 + "             \"Home\": \"Naveen\""
 + "         }"
 + "     },"
 + "     \"abcDetails\": \"asdf\","
 + "     \"mobile\": 123455"
 + " },"
 + " {"
 + "     \"id\": 2,"
 + "     \"empid\": \"64848\","
 + "     \"details\": {"
 + "         \"name\": \"eryje\","
 + "         \"age\": 3027,"
 + "         \"sex\": \"M\","
 + "         \"Address\": {"
 + "             \"Office\": \"office\","
 + "             \"Home\": \"Vivek\""
 + "         }"
 + "     },"
 + "     \"abcDetails\": \"fhkdl\","
 + "     \"mobile\": 389928"
 + " }"
 + "]";

    
    static String s= "{\"Test1\":[{ \n"
    		+ "    		  \"subTest0\":\"value1\"},\n"
    		+ "    		  {\"subTest1\":\"value\"}],\n"
    		+ "    		\"Test2\":  [{\"subTest2\":\"value1\"},\n"
    		+ "    		  {\"subTest3\":\"Placeholdervalue\"}]}";
    
    
    public static void main(String[] args) throws Exception {
    	
    	JSONArray ja = new JSONArray(json);
    	System.out.println(ja);
    	
    	for(int i=0;i<ja.length();i++)
    	{
    		
         JSONObject jo= ja.getJSONObject(i);
         
//         JSONObject id = jo.getJSONObject("id");
       JSONObject details = jo.getJSONObject("details");
       JSONObject address = details.getJSONObject("Address");
       String name = address.getString("Home");
         
         System.out.println(name);
         
    	} 
    	
    	
    	
         
         //2nd json
         
         JSONObject jos = new JSONObject(s);
         System.out.println(jos);
        	 
         JSONArray ja1 = jos.getJSONArray("Test2");
         JSONArray ja2 = jos.getJSONArray("Test1");
         JSONObject subtest3 =null;
         
         for(int i=0;i<ja1.length();i++)
         {
        	 subtest3 = ja1.getJSONObject(i);
        	 System.out.println(subtest3.toString());
        	 
        	if(subtest3.toString().contains("subTest3"))
        	{
        	 
        		 String value= subtest3.getString("subTest3");
            	 System.out.println(value);
        	 
        	}
        	 
         }
        	 
        	
        	 
        	 
        	 
         
         
       
      
        
    }
}