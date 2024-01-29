package Test.String;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;

public class PrefixFlowerFlowFlirt{
    
    public static void main(String args[])

    {
       /*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

    */
        ArrayList < Character > as = new ArrayList < Character > ();

    String s = "flower flow flight";
    
    String s1 [] = s.split("\\s");
    char c[] = s.toCharArray();
    int count =0;
     
        
         for(int i=0;i<c.length;i++)
        {
            if(!as.contains(c[i]))
            {
            for (int j=0;j<s.length();j++)
                {
    
                  if(s.charAt(j)==c[i])
                  {
                 count++;
                 
                    }
       
                } 
                    if(count>=3)
                    {
                         as.add(c[i]);
                     }
                     
                     count=0;

            }
       
        }
        
        System.out.println(as);
        
    }
    
    
    
    
    
}