package Array;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		HashMap<Integer,Integer>map=new HashMap<>();
		int[] arr= {2,3,4};
		int target=6;
		int first=0;
		int second=0;
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],i);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=(target-arr[i]) && map.containsKey(target-arr[i])) {
		       first=i;
		       second=map.get(target-arr[i]);
		      break;
			}
		
		}
		System.out.println("["+first+ " ," + second + "]");
		
	}

}
