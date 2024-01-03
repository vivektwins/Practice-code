package Test;
import java.util.*;
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;

public class repeatedoccurrencecount
{

 
 
  public static void main(String[] args)
  {
       String s = "aaabbaacc";
       char c [] = s.toCharArray();
       Arrays.sort(c);
	   ArrayList<Character> as = new ArrayList<Character>();
	   boolean value = false;
       
       int count=0;
       for(int i=0;i<c.length;i++)
       {
           count =0;
           if(!as.contains(c[i]))
           {
            for(int j=0;j<c.length;j++)
                {
               
                if(c[i]==c[j])
                    {
                   
                        as.add(c[j]);
                        count++;
                        System.out.println(c[j] + "-" +count);
                        
                    }
               
                  
                   
                   
               
               
                }
           }
           
       }
       
      
     
     
    }
}
	
