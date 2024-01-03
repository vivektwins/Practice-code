package Test;

public class next_value_iterate_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,3,5,6,7,8,9,0};
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(i + " " + a.length);
			if(i!=a.length-1)
			{
				System.out.println(a[i] + " " + a[i+1]);
			}
			else
			{
				System.out.println(a[i]);
			}
		}
	}

}
