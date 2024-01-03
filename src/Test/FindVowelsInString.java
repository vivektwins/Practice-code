package Test;

public class FindVowelsInString {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= " a Hellow is this keyword";
		
		String[] sArray = {"Hellow", "how are", "you"};
	    String s = "";
	    for (String n:sArray)
	        s+= n;
	    char[] c1 = s.toCharArray();
	    
	    System.out.println(c1);
		
		char c[] = a.toCharArray();
		for (int i=0;i<c.length;i++)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
			{
				System.out.println(c[i]);
			}
		}

	}

}
