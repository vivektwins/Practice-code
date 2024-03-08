package Test;

import java.awt.Container;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Test.Character.characterPalindrome;
import Test.String.patternclass;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class test {
	static ArrayList<String> as = new ArrayList<String>();
	static Set<Character> set = new HashSet<Character>();

	public static void printall(StringBuffer prefix, char[] c, int length)
	{
		if(length==0)
		{
		as.add(prefix.toString());
			return;
		}
		for(int i=0;i<c.length;i++)
		{
			StringBuffer bs = new StringBuffer();
			bs.append(prefix.toString());
			bs.append(c[i]);
			printall(bs, c, length-1);
		}
	}
	
	
	

	public static void main(String[] args) throws JSONException {
		
	    // System.out.println(getPermutations("ABC"));
		
		
		
		int a=153,count=0;
		int number =a, reverse=0,spy=1;
		int fact =1,n=10;
		String temp = "";
		Map<Character,Integer> hm= new HashMap<Character, Integer>();
		StringBuffer sb = new StringBuffer();
		String s[]= {"dog", "racecar","car"};
		for(int i=0;i<s.length;i++)
		{
			char c[] = s[i].toCharArray();
			for(int j=0;j<c.length;j++)
			{
				set.add(c[j]);
			}
			for(char ch: set)
			{
				sb.append(ch);
			}
			set.clear();
		}
		System.out.println(sb.toString());
		
		
	}
}
