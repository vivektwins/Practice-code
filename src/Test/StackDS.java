package Test;

import java.util.LinkedList;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class StackDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
        s.push(3);
        
       // s.pop();
        s.peek();
        
        System.out.println(s.pop());
        
        SortedSet<String> set=new TreeSet();  
        set.add("Z");  
        set.add("B");  
        set.add("E");  
        set.add("D");  
        set.add("E");  
        
        System.out.println(set);
        
        LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        ll.add("Anuj");  
        ll.add("Gaurav");  
        
        System.out.println(ll);
        
       
	}

}
