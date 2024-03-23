package Test;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

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
         //System.out.println(jo.getString("id"));
         
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
        	 
        	
        	 
         
       String complex = "{\n"
       		+ "\"problems\": [{\n"
       		+ "    \"Diabetes\":[{\n"
       		+ "        \"medications\":[{\n"
       		+ "            \"medicationsClasses\":[{\n"
       		+ "                \"className\":[{\n"
       		+ "                    \"associatedDrug\":[{\n"
       		+ "                        \"name\":\"asprin\",\n"
       		+ "                        \"dose\":\"\",\n"
       		+ "                        \"strength\":\"500 mg\"\n"
       		+ "                    }],\n"
       		+ "                    \"associatedDrug#2\":[{\n"
       		+ "                        \"name\":\"somethingElse\",\n"
       		+ "                        \"dose\":\"\",\n"
       		+ "                        \"strength\":\"500 mg\"\n"
       		+ "                    }]\n"
       		+ "                }],\n"
       		+ "                \"className2\":[{\n"
       		+ "                    \"associatedDrug\":[{\n"
       		+ "                        \"name\":\"asprin\",\n"
       		+ "                        \"dose\":\"\",\n"
       		+ "                        \"strength\":\"500 mg\"\n"
       		+ "                    }],\n"
       		+ "                    \"associatedDrug#2\":[{\n"
       		+ "                        \"name\":\"somethingElse\",\n"
       		+ "                        \"dose\":\"\",\n"
       		+ "                        \"strength\":\"500 mg\"\n"
       		+ "                    }]\n"
       		+ "                }]\n"
       		+ "            }]\n"
       		+ "        }],\n"
       		+ "        \"labs\":[{\n"
       		+ "            \"missing_field\": \"missing_value\"\n"
       		+ "        }]\n"
       		+ "    }],\n"
       		+ "    \"Asthma\":[{}]\n"
       		+ "}]}";
       
       
       Gson gson = new Gson();

       JsonElement je = gson.fromJson(complex, JsonElement.class);

       JsonObject jo = je.getAsJsonObject();
//       System.out.println(jo);
//       System.out.println(jo.getAsJsonArray("problems"));
      
//       JsonObject location = jo.getAsJsonObject("location");
//
//       String region = location.get("region").getAsString();
       
       
      
       
       JSONObject jos1 = new JSONObject(complex);
       //JSONArray jas= new JSONArray(complex);
       
       System.out.println("JSon object - "+ jos1);
       for(int i=0;i<jos1.length();i++)
       {
    	  
    	   JSONArray problems = jos1.getJSONArray("problems");
    	   System.out.println(problems.length());
    	   
    	   for(int j=0;j<problems.length();j++)
    	   {
    		   JSONObject Diabetes=problems.getJSONObject(j);
    		   System.out.println("JSon object - "+Diabetes);
    	   
    		   JSONArray labs=Diabetes.getJSONArray("Diabetes");
    		   System.out.println("JSon Array - "+labs);
    		   JSONObject missing_field =labs.getJSONObject(j);
    		   //JSONArray js3=jos3.getJSONArray("labs");
    		   System.out.println("JSon object - "+missing_field);
    		   JSONArray missing =missing_field.getJSONArray("medications");
    		   System.out.println("JSon Array - "+missing);
    		   JSONObject medicationsClasses =missing.getJSONObject(j);
    		   System.out.println("JSon object - "+medicationsClasses.getJSONArray("medicationsClasses"));
    		   JSONArray className2= medicationsClasses.getJSONArray("medicationsClasses");
    		   JSONObject className2obj = className2.getJSONObject(j);
    		   System.out.println("JSon object - "+ className2obj);
    		   
    				   
    	   }
       }
       
       
       //find the name where width and height >690
       //to get the int value store it in object change it to tostring
       
       
       String s= "{\n"
       		+ "    \"Test222\": [\n"
       		+ "        {\n"
       		+ "            \"name\": \"Test Data123\",\n"
       		+ "            \"effectiveDate\": \"2021-09-27T04:01:00Z\",\n"
       		+ "            \"amt\": \"$10/$200\",\n"
       		+ "            \"width\": \"690\",\n"
       		+ "            \"Height\": \"1200\",\n"
       		+ "            \"premium\": {\n"
       		+ "                \"amount\": 0,\n"
       		+ "                \"currency\": \"usd\"\n"
       		+ "            },\n"
       		+ "            \"code\": \"sfdsfdf\"\n"
       		+ "        },\n"
       		+ "        {\n"
       		+ "            \"name\": \"Test Data1234\",\n"
       		+ "            \"effectiveDate\": \"2021-09-27T04:01:00Z\",\n"
       		+ "            \"amt\": \"$50\",\n"
       		+ "            \"width\": \"500\",\n"
       		+ "            \"Height\": \"800\",\n"
       		+ "            \"premium\": {\n"
       		+ "                \"amount\": 0,\n"
       		+ "                \"currency\": \"usd\"\n"
       		+ "            },\n"
       		+ "            \"code\": \"ewr\"\n"
       		+ "        },\n"
       		+ "        {\n"
       		+ "            \"name\": \"Test Data12345\",\n"
       		+ "            \"effectiveDate\": \"2021-09-27T04:01:00Z\",\n"
       		+ "            \"amt\": \"$70\",\n"
       		+ "            \"width\": \"691\",\n"
       		+ "            \"Height\": \"1300\",\n"
       		+ "            \"premium\": {\n"
       		+ "                \"amount\": 0,\n"
       		+ "                \"currency\": \"usd\"\n"
       		+ "            },\n"
       		+ "            \"code\": \"ewr\"\n"
       		+ "        },\n"
       		+ "        {\n"
       		+ "            \"name\": \"Test Data123456\",\n"
       		+ "            \"effectiveDate\": \"2021-09-27T04:01:00Z\",\n"
       		+ "            \"amt\": \"$80\",\n"
       		+ "            \"width\": \"692\",\n"
       		+ "            \"Height\": \"1400\",\n"
       		+ "            \"premium\": {\n"
       		+ "                \"amount\": 0,\n"
       		+ "                \"currency\": \"usd\"\n"
       		+ "            },\n"
       		+ "            \"code\": \"ewr\"\n"
       		+ "        },\n"
       		+ "        {\n"
       		+ "            \"name\": \"Test Data1234567\",\n"
       		+ "            \"effectiveDate\": \"2021-09-27T04:01:00Z\",\n"
       		+ "            \"amt\": \"$90\",\n"
       		+ "            \"width\": \"593\",\n"
       		+ "            \"Height\": \"1100\",\n"
       		+ "            \"premium\": {\n"
       		+ "                \"amount\": 0,\n"
       		+ "                \"currency\": \"usd\"\n"
       		+ "            },\n"
       		+ "            \"code\": \"ewr\"\n"
       		+ "        }\n"
       		+ "    ]\n"
       		+ "}";
       
       JSONObject jos11 = new JSONObject(s);  
       JSONArray test22 = jos11.getJSONArray("Test222");
       for(int i=0;i<test22.length();i++)
       {
       	 JSONObject jo11= test22.getJSONObject(i);
       	 System.out.println(jo11);
       	 
   		 String width=jo11.getString("width");
//   		Object premium=jo11.getJSONObject("premium");
//   		System.out.println(premium.toString());
   		 String height = jo11.getString("Height");
   	     String name = jo11.getString("name");
   	     int width_value = Integer.parseInt(width);
   	     int height_value = Integer.parseInt(height);
   	     
   		  
   		   if(width_value>=690 && height_value>=1200)
   		   {
   			   System.out.println(name);
   		   }

       }
        	 
        	 
         
         
       
      
        
    }
}