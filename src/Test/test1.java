package Test;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Example 1:
//
//			Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//			Output: 6
//			Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//			Example 2:
//
//			Input: nums = [1]
//			Output: 1
//			Explanation: The subarray [1] has the largest sum 1.
//			Example 3:
//
//			Input: nums = [5,4,-1,7,8]
//			Output: 23
//			Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
//			 
//
//			Constraints:
//
//			1 <= nums.length <= 105
//			-104 <= nums[i] <= 104
		
		
		int num[] = {-2,1,-3,4,-1,2,1,-5,4};
		int n[]= {1};

		int a=0;
		
		Arrays.sort(n);
		System.out.println(Arrays.binarySearch(num, -3));
		
		for(int i=0;i<n.length;i++)
		{
			//a+=n[i];
			
			if(n.length==1)
			{
				//System.out.println(n.length);
				
			}
			
			else
			{
				a+=n[i];
				
				if(a<=0)
				{
					System.out.println("Going negative side ");
				}
			}
			
			
			
		}
		//System.out.println(a);
		
		
		

	}

}
