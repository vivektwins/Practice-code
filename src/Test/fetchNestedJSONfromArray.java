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
    }
}