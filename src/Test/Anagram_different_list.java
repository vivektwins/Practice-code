package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram_different_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = { "eat", "tea", "tan", "ate", "nat", "bat" ,"mat"};

		ArrayList<String> as = new ArrayList<String>();
		ArrayList<String> bs = new ArrayList<String>();
		ArrayList<String> cs = new ArrayList<String>();

		Map<String, List<String>> hm = new HashMap<String, List<String>>();
		String temp = "";

		for (int i = 0; i < s.length; i++) {
			char c[] = s[i].toCharArray();
			Arrays.sort(c);
			for (int j = 0; j < c.length; j++) {
				temp += String.valueOf(c[j]);
			}
			as.add(temp);
			temp = "";

			// System.out.println(as);
		}

		for (int i = 0; i < as.size(); i++) {

			if (!cs.contains(as.get(i)))
				for (int j = 0; j < as.size(); j++) {
					if (as.get(i).equals(as.get(j))) {
						bs.add(s[j]);
						cs.add(as.get(i));
						// hm.put(s[i], bs);

					}

				}
			if (!bs.isEmpty()) {
				System.out.println(bs);
				bs.clear();
			}

		}

	}

}
