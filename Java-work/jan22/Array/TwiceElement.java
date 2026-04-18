package Array;

import java.util.HashMap;

public class TwiceElement {
	public static void main(String[] args) {
//		int[] arr = { 2, 3, 4, 2 };
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println("True");
//					return;
//				}
//			}
//		}
//		System.out.println("False");
		
		
		
//		 Time complexity o(n)
		HashMap<Integer,Integer>map=new HashMap<>();
		int[] arr = { 2, 3, 4, 2 };
		for(int n:arr) {
			map.put(n, map.getOrDefault(n,0)+1);
		}
		for(int key:map.keySet()) {
			if(map.get(key)==2) {
				System.out.println("Have Twice");
				return;
			}
		}
		System.out.println("Not Have");
	}
}
