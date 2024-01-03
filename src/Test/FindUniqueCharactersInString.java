package Test;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;

public class FindUniqueCharactersInString
{

 
 
  public static void main(String[] args)
  {
      
      ArrayList<Character> as = new ArrayList<Character>();
      HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
      String s= "aabbcddaef";
      
      char c[] = s.toCharArray();
      Arrays.sort(c);
      
      for(int i=0;i<c.length;i++)
      {
          int count=0;
          if(!as.contains(c[i]))
              {
                  for(int j=0;j<c.length;j++)
                  {
                      
                        if(c[i]==c[j])
                            {
                          as.add(c[i]);
                          count++;
                          
                          
                          
                            }
                    
                  }
                  //System.out.println(c[i] + " -" + count);
                  hm.put(c[i],count);
            }
      }
      
      
      for(Map.Entry<Character,Integer> m:hm.entrySet())
      {
          
          
          if(m.getValue()==1)
          {
              System.out.println(m.getKey());
          }
         /* if(m.containsKey(count)==1)
          {
             System.out.println(m.getValue());
          }*/
      }
      
      
      
      
      
      
      
      
      
	
	
/*	for( int i=0;i<bs.size();i++)
	{
	    System.out.println(bs.get(i));
	}*/
	
	}
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String s= "aabbaaabab";
	String s1 = " ";
	boolean value =true;
	boolean repeat = true;
	
	ArrayList<Character> as = new ArrayList<Character>();
	HashMap<Integer,Character> hm = new HashMap<Integer,Character>();
	char c[] = s.toCharArray();
	
    for(int i=0;i<c.length;i++)
		{
			int count =0;
			for(int j=0;j<c.length;j++)
			{
			    if(c[i]==c[j] && count!=3 && count!=1 && repeat == false)
			    {
			        continue;
			        
			    }
			    else if(c[i]==c[j] && count<=2){
			        count++;
			        as.clear();
			        
			        
			    }
			    else{
			        count=1;
			        repeat =false;
			        //s1 = s1+" "+c[j];
			    }
			    
			    s1 = s1+" "+c[j];
			    
			    
			    
			     //System.out.println(as);
	        }
	       
	        break;
		}
		
		System.out.println(s1);*/

