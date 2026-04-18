package Array;

public class BinarySearch {
  public static void main(String[] args) {
	  int[] arr= {1,2,3,4,5,6,7,8,9};
	  int target=7;
	  int left=0;
	  int right=arr.length-1;
	  while(left<right) {
		  int mid=(right+left)/2;
		  if(arr[mid]==target) {
			  System.out.println("Element Found at index: " + mid + " value is : "+arr[mid]);
			  return;
		  }
		  else if(target>arr[mid]) {
			  left=mid+1;
		  }
		  else if(target<arr[mid]) {
			  right=mid-1;
		  }
	  }
	  System.out.println("Element not Found");
  }
}
