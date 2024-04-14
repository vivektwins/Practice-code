package Test.String;

public class StringInbuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "ABC";
		String s1= "DEF";
		
		//concat

		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		
		//trim
		
		String trim = "hi hello ";
		System.out.println(trim.trim()+"gh");
		
		//split
		String split[] = trim.split("\\s");
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
		
		
		//subString and subsequence
		String sub = "abcde";
		System.out.println(sub.substring(0,3));
		System.out.println(sub.subSequence(0,3));
		
		
		//string compare and strip, equals
		String com= "   abc";
		String com1 = "abc";
		System.out.println(com.compareTo(com1));
        System.out.println(com==com1);
        System.out.println(com.equalsIgnoreCase(com1));
        System.out.println(com.strip());
        
        
        //join
        String gfg1 = String.join(" < ", "Four", "Five", "Six", "Seven"); 
        
        System.out.println(gfg1);
        
	}

}
