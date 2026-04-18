package Array;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 4, 9, 7,7,9, 6 };
		int maxElement = arr[0];
		int secondMax = arr[0];
		if(arr.length==1) {
			System.out.println(-1);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxElement) {
				maxElement = arr[i];
			}
			if (arr[i] < maxElement && arr[i] >= secondMax) {
				secondMax = arr[i];
			}
		}

		System.out.println(secondMax);
	}
}
