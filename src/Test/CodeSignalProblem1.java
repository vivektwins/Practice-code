package Test;

public class CodeSignalProblem1 {
	    public static boolean solution(String firstNum, String secondNum, String thirdNum) {
	        int second = Integer.parseInt(secondNum);
	        int third = Integer.parseInt(thirdNum);
	        
	        // Iterate through each digit of the first number
	        for (int i = 0; i < firstNum.length(); i++) {
	            StringBuilder sb = new StringBuilder(firstNum);
	            // Remove one digit at a time
	            sb.deleteCharAt(i);
	            int modifiedFirst = Integer.parseInt(sb.toString());
	            // Check if the modified first number plus the second number equals the third number
	            if (modifiedFirst + second == third) {
	                return true;
	            }
	        }
	        
	        return false; // If no combination works, return false
	    }

	    public static void main(String[] args) {
	        System.out.println(solution("10534", "67", "1120")); // Output: true
	        System.out.println(solution("10000", "67", "1120")); // Output: false
	        System.out.println(solution("1067", "33", "100"));   // Output: false
	        System.out.println(solution("153", "153", "306"));   // Output: true
	    }
	}



