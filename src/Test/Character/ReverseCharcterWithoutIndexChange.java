package Test.Character;

public class ReverseCharcterWithoutIndexChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="aeiouyt";
		char c[]= s.toCharArray();
		Character c1[] = new Character[s.length()];
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='a' && c[i]!='e' && c[i]!='i' && c[i]!='o' && c[i]!='u')
			{
				c1[i]=c[i];
				
			}
		}
		
		
		
		for(int i=c.length-1;i>=0;i--)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
			{
				for(int j=0;j<c.length;j++)
				{
					//System.out.println(c1[j]);
					if(c1[j]==null)
					{
						c1[j]=c[i];
						break;
					}
				}
			}
		}
		
		for(int i=0;i<c1.length;i++)
		{
			System.out.print(c1[i]);
		}
		
	}

}
