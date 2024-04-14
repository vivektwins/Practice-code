package Test;

import java.awt.Container;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.gson.JsonArray;

import Test.Character.characterPalindrome;
import Test.String.patternclass;
import Test.String.permutations;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class test {
	static ArrayList<String> as = new ArrayList<String>();
	static ArrayList<Integer> inas = new ArrayList<Integer>();
	static NavigableMap<Integer, Integer> navmap = new TreeMap<Integer, Integer>();
	static ArrayList<Character> character = new ArrayList<Character>();
	static Set<Integer> in = new TreeSet<Integer>();
	static ArrayList<String> bs = new ArrayList<String>();
	static Set<Character> set = new LinkedHashSet<Character>();
	static Set<String> stringset = new LinkedHashSet<String>();
	static Set<Character> charset = new HashSet<Character>();
	static Set<Integer> intset = new HashSet<Integer>();
	static Map<Character,Integer> hm= new LinkedHashMap<Character, Integer>();
	static Map<String,Integer> hm1= new LinkedHashMap<String, Integer>();
	static Stack<Character> stack = new Stack<Character>();
	static StringBuffer sb = new StringBuffer();
	static Map<Integer,List<String>> map = new HashMap<Integer, List<String>>();
	static Logger log = Logger.getLogger(test.class.getName());

	static Map<Integer,String> listmap= new HashMap<Integer, String>();
	static int n =10;
	static String s= "geeks";
  
	//["bat, ["nat", "tan"]
	
//	input: str1 = “listen”  str2 = “silent”
//			Output: “Anagram”
//			Explanation: All characters of “listen” and “silent” are the same.
//			 
//			St1 = "aa" , str ="aaa" --> Not an Anagram
	
	
    
	
	
	public static void main(String args[]) {

		int ar=153;
		int count=0, reverse=0, spy=1;
		int number =ar;
		int n1=0,n2=1,n3=0;
		String temp, temp2 = "";
		int temp1=0;
		
			String s= "forgeeksskeegfor";
	      String substring= "";
	      int len = s.length();
	      int k,j;
	     for(int i=0;i<=s.length();i++)
	     {
	    	 k=i;
	    	 for(j=0;k<=s.length();j++)
	    	 {
	    		substring = s.substring(j,k);
	    		System.out.println(substring);
	    		k++;
	    	 }
	     }
		
		
		   }
}
	
	  
		
		
		
		
//      {"fruits" : {"oranges":"123", "apples":"234"}}
// "https"//test.test.com"
// GET


   
//    String resp = "{\n"
//    		+ "	\"Age\": {\n"
//    		+ "		\"Random\": {\n"
//    		+ "			\"Count\": 3,\n"
//    		+ "			\"Min\": 10,\n"
//    		+ "			\"Max\": \"vivek\"\n"
//    		+ "		}\n"
//    		+ "	}\n"
//    		+ "}";
//    		
//
//    JSONObject jos = new JSONObject(resp);
//    
//    JSONObject Age = jos.getJSONObject("Age");
//    JSONObject random = Age.getJSONObject("Random");
//    
//    System.out.println(random);
//    System.out.println(random.getInt("Min"));
//    System.out.println(random.getInt("Count"));
//    System.out.println(random.getString("Max"));
//    
//    for(int i=0;i<jos.length();i++)
//    {
//    	//System.out.println(jos.get(i));
//        JSONObject jos1= jos.get(i);
//        String value = jos1.getString(i);
//        Assert.assertEquals(234, value.)
//    }
			
	//*[class@='._5THWM1',contains((text() ,"String"))];
	

