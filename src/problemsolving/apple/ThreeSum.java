package problemsolving.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length && nums[i] <= 0) {
            if (i == 0 || nums[i] != nums[i - 1])
                search(nums, i, output);
            i++;
        }
        return output;
    }

    private void search(int[] arr, int i, List<List<Integer>> output) {
        int right = arr.length - 1;
        int left = i + 1;
        while(left < right) {
            int sum = arr[i] + arr[left] + arr[right];
            if (sum < 0){
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                output.add(Arrays.asList(arr[i], arr[left++], arr[right--]));
                while (left < right && arr[left] == arr[left - 1])
                    left++;
            }
        }

    }
}
