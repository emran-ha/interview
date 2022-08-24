package problemsolving.infotech;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Permutation {

    public static List<List<String>> findPermutations(String[] nums) {
        List<List<String>> result = new ArrayList<>();
        Queue<List<String>> permutations = new LinkedList<>();
        permutations.add(new ArrayList<>());
        for (String currentNumber : nums) {
            // we will take all existing permutations and add the current number to create new permutations
            int n = permutations.size();
          //  System.out.println("permtutaion size"+n);
            for (int i = 0; i < n; i++) {
                List<String> oldPermutation = permutations.poll();
                // create a new permutation by adding the current number at every position
                for (int j = 0; j <= oldPermutation.size(); j++) {
                    List<String> newPermutation = new ArrayList<>(oldPermutation);
                    newPermutation.add(j, currentNumber);
                    if (newPermutation.size() == nums.length)
                        result.add(newPermutation);
                    else
                        permutations.add(newPermutation);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<String>> result = Permutation.findPermutations(new String[] { "a", "b", "c" });
        System.out.print("Here are all the permutations: " + result);
    }
}
