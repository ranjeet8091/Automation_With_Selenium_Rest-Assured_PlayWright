package Array;

import java.util.ArrayList;

public class RemoveElement {
//	 This Question Contains two Approach 
//	1.) if you don't want to use extra space then you go with (j)'s Approach 
	public static void main(String[] args) {
		int[] arr= {0,1,2,2,3,0,4,2};
		ArrayList<Integer>result=new ArrayList<>();
		int val=2;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=val) {
				arr[j++]=arr[i]; // remove this if you  want to use extra space
				result.add(arr[i]);// remove this if you don't want to use extra space
			}
		}
		for(int i=j;i<arr.length;i++) {
			arr[i]=0;
		}
		for(int n:arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println(result);//remove this if you don't want to use extra space
	}

}
