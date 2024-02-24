package Test;

import java.util.ArrayList;
import java.util.*;

public class dataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		String s = String.valueOf(a);
		System.out.println(s +" "+ "Integer  to String");
		
		
		String i ="100";
		int b = Integer.parseInt(i);
		System.out.println(b +" "+ "String to Int");
		
		char d = 'a';
		//String c = String.valueOf(d);
		String c= Character.toString(d);
		
		System.out.println(c +" "+ "char to String");
		
		String e ="b";
		char f = e.charAt(0);
		System.out.println(f +" "+ "String to char");
		
		// entering int values
		int a1=10;
		Scanner s1= new Scanner(System.in);
		int b1 = s1.nextInt();
		s1.close();
		
		//entering string values
		
	
		Scanner s2= new Scanner(System.in);
		String ent = s2.nextLine();
		System.out.print(ent);             
		s2.close();
		
		//Entering list values
		
		Scanner reader = new Scanner(System.in); 
        ArrayList<String> memory = new ArrayList<String>(); 
         
        while(true) 
        { 
            memory.add(reader.nextLine()); 
            System.out.println(memory.toString()); 
        } 
	}

}
