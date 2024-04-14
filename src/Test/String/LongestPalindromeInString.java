package Test.String;

public class LongestPalindromeInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "forgeeksskeegfor",substring="",longest="";

        int len,i,j,k;
        System.out.println("Enter String");
        
        len=str.length();
        for(i=0;i<=len;i++) {
            for(j=0,k=i;k<=len;j++) {
            
            substring=str.substring(j,k);
            
            System.out.println("sub "+ substring);
            if(palindrome(substring))
            {
                longest=substring;
                
            }
            k++;
        }
        }
        System.out.println(longest);
	}

    
    static boolean palindrome(String str)
    {
        int len=str.length();
        int i;
        String temp="";
        for(i=len-1;i>=0;i--) {
            temp=(temp+str.charAt(i));
        }
        if(temp.equals(str)) 
            return true;
        else 
        	return false;
   
    }


}


