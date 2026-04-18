package Array;

import java.util.ArrayList;

public class KidsWithGreatestNumberOfCandies {
	
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true]
	
   public static void main(String[] args) {
	   int[] candies = {2,3,5,1,3};
	   ArrayList<Boolean> result=new ArrayList<>();
	   int extraCandies = 3;
	   
	   int maxCandies=-1;
	   for(int i=0;i<candies.length;i++) {
		   if(candies[i]>maxCandies) {
			   maxCandies=candies[i];
		   }
	   }
	   
	   for(int i=0;i<candies.length;i++) {
		   if((candies[i]+extraCandies)>=maxCandies) {
			   result.add(true);
		   }
		   else {
			   result.add(false);
		   }
	   }
	   System.out.println(result);
   }
}
