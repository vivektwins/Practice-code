package Test;

public class CodeSignalProblem2 {


	    public static int solution(String inputStr) {
	        // Count occurrences of each character
	        int[] charCounts = new int[26];
	        for (char c : inputStr.toCharArray()) {
	            charCounts[c - 'a']++;
	        }

	        // Count how many characters appear an odd number of times
	        int oddCount = 0;
	        for (int count : charCounts) {
	            if (count % 2 == 1) {
	                oddCount++;
	            }
	        }

	        // Logic for determining the number of ways
	        if (oddCount == 0) {
	            // If no characters or all characters appear an even number of times,
	            // we can add any character (26 options) or none.
	            return 26 + 1; // Adding 1 for the option of adding no characters
	        } else if (oddCount == 1) {
	            // If exactly one character has an odd count, we can add any of the other characters
	            // to make it even, or not add anything if it already meets the condition.
	            return 26; // Not adding 1 here since the string already meets the palindrome condition
	        } else {
	            // If more than one character appears an odd number of times,
	            // we can only add one of these odd-count characters.
	            return oddCount;
	        }
	    
	}
	    
	    public static void main(String args[])
	    {
	    	System.out.println(CodeSignalProblem2.solution("abba"));
	    }

}
