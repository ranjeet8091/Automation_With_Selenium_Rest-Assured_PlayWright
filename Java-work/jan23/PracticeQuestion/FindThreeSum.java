package PracticeQuestion;

import java.util.*;

public class FindThreeSum {

    public static void main(String[] args) {
            int[] nums= {10,20,30,5,10,45};
            int target=60;
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) 
            {

                // Skip duplicate first elements
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right)
                {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == target) 
                    {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip duplicates
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if (sum < target)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }
            System.out.println(result);
        
    }
}