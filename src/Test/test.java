package Test;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;

import Test.String.patternclass;

public class test {
	
//	String s= "{"Test1":[{ 
//	  "subTest0":"value1},
//	  {"subTest1":"value}],
//	  [{"subTest2":"value1"},
//	  {"subTest3":"Placeholdervalue"}]}"
	  
	public static int match(int a[], int n)
	{
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				b= a[i];
				System.out.println(a[i]);
				break;
			}
			
		}
		
		return b;
	}
	public static int check(int a[], int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(n<a[i] && n!=0)
			{
				System.out.println(a[--i]);
				System.out.println("inner");
				break;
			}
			else if(i==a.length-1 && n!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		return n;
	}
	
	 
	
    public static void main(String[] args)
    {
        // Creating an object of class inside main()
    	int a[] = {1,2,3,4,5,8};
    	Arrays.sort(a);
    	int largest = a[a.length-1];
    	int n=9;
    	int count =0;
    	test.match(a, n);
    	test.check(a, n);
    	
        
    }
}