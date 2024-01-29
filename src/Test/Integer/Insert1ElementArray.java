package Test.Integer;

public class Insert1ElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,4,5,6,7,8};
		int j=5;
		int b[] = new int[a.length+1];
		int count =0;
		for(int i=0,k=1;i<a.length+1;i++)
		{
			if(j<=a.length)
			{
			
			if(i==j)
			{
				b[i]=j;
				int y= a[i];
				++i;
				b[i]=y;
				k=i;	
				count++;
				
			}
			else if (count<=0)
			{
				b[i]= a[i];
			}
			else
			{
				b[i]= a[k];
				k++;
			}
			}
			
		}

		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
