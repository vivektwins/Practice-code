package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pattern p = Pattern.compile("[{}\\[\\]()]");
		Matcher m = p.matcher("[{}{()]");
		
		while(m.find())
		{
			System.out.print(m.group(0));
		}
				
		
	}

}
