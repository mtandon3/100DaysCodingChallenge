package dec13;

import java.util.Arrays;

public class Problem561 {
	
	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int one=0;
		//int two=(Integer) null;
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			if((i+1)%2==0) {
				if(nums[i]<one) {
					sum=sum+nums[i];
				}else {
					sum=sum+one;
				}
				one=0;
			}else {
				one=nums[i];
			}
		
		}
			
		return sum;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arra= {1,3,4,2};
		System.out.println(arrayPairSum(arra));

	}

}
