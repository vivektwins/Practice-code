	package Test.Integer;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8, 23, 19, 21, 15, 6, 11,11};
		int n=0,b=0;
		
		for(int i=a.length-1;i>=0;i--)
		{
			if(n==0)
			{
			n=a[i];
			System.out.println("leader - "+n);
			continue;
			}
			if(n<a[i])
			{
				n=a[i];
				System.out.println("leader - "+n);
			}
		}

	}

}
