package Test;

import java.awt.Container;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.lang.reflect.Array;
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
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
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
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class test {
	static ArrayList<String> as = new ArrayList<String>();
	static ArrayList<Integer> inas = new ArrayList<Integer>();
	
	static ArrayList<Character> character = new ArrayList<Character>();
	static Set<Integer> in = new TreeSet<Integer>();
	static ArrayList<String> bs = new ArrayList<String>();
	static Set<Character> set = new LinkedHashSet<Character>();
	static Set<String> stringset = new LinkedHashSet<String>();
	static Set<Character> charset = new HashSet<Character>();
	static Map<Character,Integer> hm= new HashMap<Character, Integer>();
	static Map<String,Integer> hm1= new HashMap<String, Integer>();
	static Stack<Character> stack = new Stack<Character>();
	static StringBuffer sb = new StringBuffer();
	static Map<Integer,List<String>> map = new HashMap<Integer, List<String>>();
	static Logger log = Logger.getLogger(test.class.getName());

	static Map<Integer,String> listmap= new HashMap<Integer, String>();
	static int n =10;
	
  
	//["bat, ["nat", "tan"]
	
//	input: str1 = “listen”  str2 = “silent”
//			Output: “Anagram”
//			Explanation: All characters of “listen” and “silent” are the same.
//			 
//			St1 = "aa" , str ="aaa" --> Not an Anagram
    
	
	public static void recurse(int a[], int d, int n)
	{
		for(int i=0;i<n-d;i++)
		{
			action(a);
		}
		System.out.println(Arrays.toString(a));
	}
	public static void action(int a[])
	{
		int i=0,temp=0;
		temp =a[0];
		for(i=0;i<a.length-1;i++)
			a[i]=a[i+1];
		a[i]=temp;
	}
	  

	public static void main(String args[]) throws ArithmeticException{

		int ar=157;
		int count=0, reverse=0, spy=1;
		int number =ar;
		int n1=0,n2=1,n3=0;
		int temp = 0;
		String s="ABC";
		StringBuffer bs = new StringBuffer();
		int[] arr = new int[]{1,3,3,4,5};
        int j=3;
        System.out.println("Before deletion :" + Arrays.toString(arr));
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == j){
                count++;

                // shifting elements
                for(int k = i; k < arr.length - 1; k++){
                    arr[k] = arr[k+1];
                }
                i--;
               // break;
            }
        }

        System.out.print("After Deletion :" );
        for(int i = 0; i < arr.length-count; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("Whole array :" + Arrays.toString(arr));
				
}  


	
	
	
	

	//*[class@='._5THWM1',contains((text() ,"String"))];
	
}
