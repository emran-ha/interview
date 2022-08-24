package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Permutation {
    private void backTrack(List<List<Integer>> result, List<Integer> temp, int first, int n) {
        if (first == n) {
            result.add(new ArrayList<>(temp));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(temp, first, i);
            backTrack(result, temp, first + 1, n);
            Collections.swap(temp, first, i);
        }
    }
    List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp;
        temp = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int n = nums.length;
        backTrack(result, temp, 0, n);
        return result;

    }

    public static void main(String[] args) {
        Permutation p = new Permutation();
        int[] test = {1, 2, 3};
        System.out.println(p.permutation(test));
    }
}
