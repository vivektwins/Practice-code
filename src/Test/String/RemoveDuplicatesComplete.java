package Test.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Character,Integer> hm= new LinkedHashMap<Character, Integer>();
		String s = "Hi hello where are you";
		String temp ="";
		int count=0;
		String split[] = s.split("\\s");

		String regex = "(.)\\1*";
		for (int i = 0; i < split.length; i++) {
			char c[] = split[i].toCharArray();

			for (int j = 0; j < c.length; j++) {
				count = 0;

				for (int k = 0; k < c.length; k++) {
					if (c[j] == c[k]) {
						count++;

						hm.put(c[j], count);

					}
				}
			}
			for (Map.Entry<Character, Integer> m : hm.entrySet()) {
				if (m.getValue() <= 1) {
					temp += String.valueOf(m.getKey());
				}

			}
			hm.clear();
			System.out.print(temp + " ");
			temp = "";
		}
		

	}

}
