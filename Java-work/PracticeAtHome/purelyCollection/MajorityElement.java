package purelyCollection;

import java.util.HashMap;

public class MajorityElement {
   public static void main(String[] args) {
	   int[] arr= {2,2,1,1,1,2,2};
	   HashMap<Integer,Integer>map=new HashMap<>();
	   for(int n:arr) {
		   map.put(n,map.getOrDefault(n,0)+1);
	   }
	   for(int key:map.keySet()) {
		   if(map.get(key)==(arr.length%2==0? arr.length/2:(arr.length)+1)/2) {
			   System.out.print("This is majority Element is: "+key);
		   }
	   }
   }
}
