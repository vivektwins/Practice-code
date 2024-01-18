package Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String keyword = "aaebbbaaaaddd";
		String regex = "(.)\\1+";
		ArrayList<String> as = new ArrayList();
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(keyword);
		
		while(m.find())
		{
			//System.out.println(m.group(0));
			
			char c[] = m.group(0).toCharArray();
			if(c.length>2)
			{
				as.add(m.group());
			}
			//keyword=keyword.replaceAll(m.group(0), "");
			
			
			
			//System.out.println(m.group(2));
		}
		//System.out.print(as);
		
		for(int i=0;i<as.size();i++)
		{
		keyword= keyword.replace(as.get(i), "");
		}
		System.out.println(keyword);
	}

}
