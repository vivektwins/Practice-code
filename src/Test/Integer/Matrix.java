package Test.Integer;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}}; //4+5+6 8+10+12
		int b[][]= {{4,5,6},{4,5,6},{4,5,6}};
		System.out.println(a.length);
		int c[][]= new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				//c[i][j]=0;
				
				for(int k=0;k<c.length;k++)
				{
					c[i][j]=a[i][j]*b[j][k];
				}
				
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}


//111   456
//222   456
//333   456