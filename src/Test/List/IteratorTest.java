package Test.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
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
		
		ArrayList<Integer> l = new ArrayList<Integer>();

	    // Add some items to the ArrayList
	    l.add(1);
	    l.add(2);
	    l.add(3);
	    l.add(4);
	    l.add(5);

	    ListIterator<Integer> i = l.listIterator();

	    // Loop through ArrayList contents
	    while(i.hasNext()) {
	      System.out.print(i.next()+",");
	    }

	    System.out.println();
	    System.out.println(i.previous());


	    // Loop back through ArrayList contents
	    while(i.hasPrevious()) {
	      System.out.print(i.previous() + ", ");
	    }
	    
	    System.out.println();
	    int a1[] = {1,2,3,4,5,6,7};
		for(int j=0;j<a1.length;j++)
		{
			if(j!=a1.length-1)
			{
			if(a1[j]!=a1[j+1])
			{
				System.out.println(a1[j+1]);
			}
			}
		}
    
    
	}

}
