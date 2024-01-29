package Test.oops;

import java.util.ArrayList;

public class ThrowVsThrows {
	
	
	public void test() throws InterruptedException, NullPointerException
	{
	try {
		Thread.sleep(1000);
		int a = (Integer) null;
	} catch (NullPointerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("coming here");
		System.out.println(e.getMessage());

		
	}
	finally
	{
		System.out.println("finally");
		throw new RuntimeException();
	}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String a[] = { "one", "two", "three", "five", "four" };
		ArrayList<String> as = new ArrayList<String>();

		ArrayList<String> bs = new ArrayList<String>();
		int count=0;

		for(int i=0;i<a.length;i++)
		{
			char c[]= a[i].toCharArray();
			count=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[j]=='a' || c[j]=='e'|| c[j]=='i'|| c[j]=='o'|| c[j]=='u')
				{
					count++;
					if(count==2)
					{
						break;
					}
					
				}
				else
				{
					count=0;
				}
				
			}
			if(count<=1)
			{
				as.add(a[i]);
			}
			else
			{
				bs.add(a[i]);
			}
			
			
			System.out.println(as);
			System.out.println(bs);
		}
		
		ThrowVsThrows t = new ThrowVsThrows();
		//t.test();
		
		

		
	}

}
