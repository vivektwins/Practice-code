package Test.Integer;

public class TriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.println();
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
				
			}
			//System.out.println();
		}

	}

}
