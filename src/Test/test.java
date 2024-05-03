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
 
	
	//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once
//	Example 1:
//	Input: strs = ["eat","tea","tan","ate","nat","bat"]
//	Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    
	
	
	public static void main(String args[]) {

		String s[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

		ArrayList<String> as = new ArrayList<String>();
		ArrayList<String> bs = new ArrayList<String>();
		ArrayList<String> cs = new ArrayList<String>();

		Map<String, List<String>> hm = new HashMap<String, List<String>>();
		String temp = "";

		for (int i = 0; i < s.length; i++) {
			char c[] = s[i].toCharArray();
			Arrays.sort(c);
			for (int j = 0; j < c.length; j++) {
				temp += String.valueOf(c[j]);
			}
			as.add(temp);
			temp = "";

			// System.out.println(as);
		}

		for (int i = 0; i < as.size(); i++) {

			if (!cs.contains(as.get(i)))
				for (int j = 0; j < as.size(); j++) {
					if (as.get(i).equals(as.get(j))) {
						bs.add(s[j]);
						cs.add(as.get(i));
						// hm.put(s[i], bs);

					}

				}
			if (!bs.isEmpty()) {
				System.out.println(bs);
				bs.clear();
			}

		}
		
		//System.out.println(hm.keySet() + " " +hm.values());
		
		
	}
	
}