package problemsolving.apple;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length && diff !=0; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[left] + nums[i] + nums[right];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return target - diff;
    }
}
