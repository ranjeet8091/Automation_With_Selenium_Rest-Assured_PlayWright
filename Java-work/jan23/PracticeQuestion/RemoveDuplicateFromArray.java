 package PracticeQuestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(20);
		arr.add(10);
		arr.add(10);
		arr.add(20);
		arr.add(30);

		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> result = new ArrayList<>();

		for (Integer num : arr) {
		    if (!set.contains(num)) {
		        set.add(num);
		        result.add(num);
		    }
		}

		System.out.println(result);

	}

}
