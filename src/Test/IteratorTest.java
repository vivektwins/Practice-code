package Test;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class IteratorTest {
	
	public static void main(String args[])
	{
		SortedSet<String> set=new TreeSet();  
        set.add("Z");  
        set.add("B");  
        set.add("E");  
        set.add("D");  
        set.add("E");  
        
		Iterator<String> is = set.iterator();
		
		while(is.hasNext())
		{
			System.out.println(is.next());
			//System.out.println(is.hasNext("B"));
		}
	}

}
