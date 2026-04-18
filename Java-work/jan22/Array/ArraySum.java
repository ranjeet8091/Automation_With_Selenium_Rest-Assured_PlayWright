package Array;

public class ArraySum {
	public static int sum(int[] arr) {
		int sum=0;
		for(int n:arr) {
			sum+=n;
		}
		return sum;
	}
   public static void main(String[] args) {
	   int[] arr= {1,2,3,4,5,6,7};
	   System.out.println(sum(arr));
   }
   
}
