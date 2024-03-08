package Test.String;
import java.util.*;

public class PrefixFlowerFlowFlirt{
    
    public static void main(String args[])

    {
       /*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

    */
//        ArrayList < Character > as = new ArrayList < Character > ();
//
//    String s = "flower flow flight";
//    
//    String s1 [] = s.split("\\s");
//    char c[] = s.toCharArray();
//    int count =0;
//     
//        
//         for(int i=0;i<c.length;i++)
//        {
//            if(!as.contains(c[i]))
//            {
//            for (int j=0;j<s.length();j++)
//                {
//    
//                  if(s.charAt(j)==c[i])
//                  {
//                 count++;
//                 
//                    }
//       
//                } 
//                    if(count>=3)
//                    {
//                         as.add(c[i]);
//                     }
//                     
//                     count=0;
//
//            }
//       
//        }
//        
//        System.out.println(as);
        
        
//      //Input: strs = ["flower","flow","flight"]
////    	Output: "fl"
////    		Example 2:
////
////    		Input: strs = ["dog","racecar","car"]
////    		Output: ""
////    		Explanation: There is no common prefix among the input strings.
//    	
		String s[] = { "dog", "racecar", "car" };
		int n = s.length;
		// System.out.println(n);
		String temp = "";
		char c1[] = {};

		ArrayList<Character> as = new ArrayList<Character>();
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		Set<Character> set = new LinkedHashSet<Character>();
		int count = 0;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length; i++) {

			c1 = s[i].toCharArray();
			for (int j = 0; j < c1.length; j++) {
				set.add(c1[j]);
			}
			for (Character ch : set) {
				sb.append(ch);
			}
			set.clear();
		}
		// System.out.println(sb);

		for (int i = 0; i < sb.length(); i++) {
			char c[] = sb.toString().toCharArray();
			// System.out.print(c[i]);

			for (int j = 0; j < c.length; j++) {
				count = 0;
				if (!as.contains(c[j])) {
					for (int k = 0; k < c.length; k++) {
						if (c[j] == c[k]) {
							count++;
							as.add(c[j]);
							hm.put(c[j], count);
						}
					}
				}

			}
		}
		System.out.println();

		for (Map.Entry<Character, Integer> m : hm.entrySet()) {
			if (m.getValue() == n) {
				System.out.print(m.getKey());

			}

		}

	}

}