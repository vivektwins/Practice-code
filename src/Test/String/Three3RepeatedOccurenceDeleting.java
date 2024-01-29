package Test.String;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Three3RepeatedOccurenceDeleting {
	public static void main(String[] args)
	{
		Three3RepeatedOccurenceDeleting.repeat();
	    
	}

	public static void repeat()
	{
	    Map<String,Integer> hm = new LinkedHashMap<String,Integer>();

		
	    ArrayList<Character> as = new ArrayList<Character>();
	    ArrayList<Character> bs = new ArrayList<Character>();
		String s = "aabbaaabaaaabbba";
		String s1="";
		Character f = null;
		char c[] = s.toCharArray();
		
	    for(int i=0;i<c.length;i++)
			{
				int count =0;
				if(!as.contains(c[i]))
				{
				for(int j=0;j<c.length;j++)
				{
				    int n=c.length-1;
				    if(c[i]==c[j])
				    { 
				        count++;
				        s1 = s1+" "+c[j];
				        f=c[j];
				        if(n==j)
				        {
				        //System.out.print("true"+ "n-" +n+"j-"+j);
				        hm.put((s1),count);
				        count=0;
				        s1="";
				        continue;
				        }
				        
				    }
				        
				     else if(c[i]==f && count!=0)
				     {
				       // hm.put(count, hm.get(count));
	                //    hm.remove(count);
				        
				        hm.put((s1),count);
				         //System.out.println(hm.keySet() + "----"+hm.values() +"\n");
				        count=0;
				        s1="";
				    }
				}
				as.add(c[i]);
	        
				}
			}
	        for(Map.Entry m: hm.entrySet())
	       {
	           
	          System.out.print(m.getKey()+"="+m.getValue() + "\t");
	           
	  
	       }}

}
