package Test.Integer;

public class PalindromeTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k =i-1;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
