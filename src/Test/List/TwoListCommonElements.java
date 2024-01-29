package Test.List;

import java.util.ArrayList;

public class TwoListCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> as = new ArrayList<>();
		ArrayList<Integer> bs = new ArrayList<>();
		as.add(1);
		as.add(2);
		as.add(3);
		
		bs.add(2);
		bs.add(3);
		bs.add(4);
		
		for(int i=0;i<as.size();i++)
		{
			for(int j=0;j<bs.size();j++)
			{
				if(as.get(i).equals(bs.get(j)))
				{
					System.out.println(as.get(i));
				}
			}
		}
	}

}
