package Test;
import java.util.*;

public class BalancedParanthesis {
	
	public static void main(String[] args)
	   {
//	      String expression;
//	      int i, length;
//	      char ch;
//	      Scanner s = new Scanner(System.in);
//	      
//	      System.out.print("Enter the Expression: ");
//	      expression = s.nextLine();
//	      
//	      Stack<Character> stack = new Stack<Character>();
//	      length = expression.length();
//	      
//	      for(i=0; i<length; i++)
//	      {
//	         ch = expression.charAt(i);
//	         if(ch=='(' || ch=='{' || ch=='[')
//	         {
//	            stack.push(ch);
//	         }
//	         else if(ch==')')
//	         {
//	            if(stack.isEmpty() || stack.pop() != '(')
//	            {
//	               System.out.println("\nUnbalanced Parentheses!");
//	               return;
//	            }
//	         }
//	         else if(ch=='}')
//	         {
//	            if(stack.isEmpty() || stack.pop() != '{')
//	            {
//	               System.out.println("\nUnbalanced Parentheses!");
//	               return;
//	            }
//	         }
//	         else if(ch==']')
//	         {
//	            if(stack.isEmpty() || stack.pop() != '[')
//	            {
//	               System.out.println("\nUnbalanced Parentheses!");
//	               return;
//	            }
//	         }
//	      }
//	      if(stack.isEmpty())
//	         System.out.println("\nBalanced Parentheses.");
		Stack < Character > stack = new Stack < Character > ();
		String s = "(())";
		char c[] = s.toCharArray();
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		for (int i = 0; i < c.length; i++) {
		    if ((c[i] == '{' || c[i] == '[' || c[i] == '(')) {
		        if (stack.isEmpty()) {
		            stack.push(c[i]);
		        } else if (stack.peek() == '}' || stack.peek() == ']' ||
		            stack.peek() == ')') {
		            stack.push(c[i]);
		        } else {
		            System.out.println("unbalanced paranthesis");
		        }
		    } else if (c[i] == '}' || c[i] == ']' || c[i] == ')')
		        if (stack.isEmpty()) {
		            stack.push(c[i]);
		        }
		    else if (stack.peek() == '{' || stack.peek() == '[' ||
		        stack.peek() == '(') {
		        stack.push(c[i]);
		    } else {
		        System.out.println("unbalanced paranthesis");
		    }

		}
		System.out.println(stack);
		
		
	   }
	
}



