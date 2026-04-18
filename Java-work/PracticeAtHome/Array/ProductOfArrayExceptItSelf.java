package Array;

import java.util.ArrayList;

public class ProductOfArrayExceptItSelf {
  public static void main(String[] args) {
//	  Input: nums = [1,2,3,4]
//      Output: [24,12,8,6]
	  ArrayList<Integer>result=new ArrayList<>();
	  int[] nums = {1,2,3,4};
	 
//	  ---------------------------------Approach 1 -------------------------------------------
//	  int product=1;
//	  for(int i=0;i<nums.length;i++) {
//		  product*=nums[i];
//	  }
//	  for(int i=0;i<nums.length;i++) {
//		  result.add(product/nums[i]);
//	  }
//	  System.out.println(result);
	  
//	  ----------------------------------Approach 2 -------------------------------------------
	  for(int i=0;i<nums.length;i++) {
		  int product=1;
		  for(int j=0;j<nums.length;j++) {
			  if(i!=j) {
				  product*=nums[j];
			  }
		  }
		  result.add(product);
	  }
	  System.out.println(result);
  }
}
