package Test.String;

public class AlphabetsAlternateCharReplace {
	public static void main(String[] args) 
    {
    	int a[]= {1,2,4,5,6,7};
    	int last=0;
		String s = "hi hello how are yzz";
		String split[] = s.split("\\s");
		String temp = "";

		char c[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
				'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b' };
		for(char ch='a';ch<='z';ch++)
		{
			System.out.print(ch);
		}
		System.out.println();

		for (int i = 0; i < split.length; i++) {
			char c1[] = split[i].toCharArray();
			temp = "";
			int a1 = i;
			i = 0;
			for (int j = 0; j < c.length; j++) {

				if (c1.length > i) {
				
					if (c1[i] == c[j]) {

						temp += String.valueOf(c[j + 2]);
						i++;
						j = 0;
					}
				}
				else
				{
					break;
				}

			}
			i = a1;
			System.out.print(temp + " ");

    	}
    }

}
