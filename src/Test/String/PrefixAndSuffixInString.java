package Test.String;

import java.util.ArrayList;

public class PrefixAndSuffixInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> as = new ArrayList<String>();
		String s = "aabbcaabb";
		int n = s.length();
		for(int i=n/2;i>0;i--)
		{
			System.out.println(i);
			String prefix = s.substring(0,i);
			String suffix = s.substring(n-i);
			
			
			if(prefix.equals(suffix))
			{
				as.add(prefix);
				as.add(suffix);
			}
			break;
		}
		
		System.out.println(as);
		
	}

}
