package problemsolving.infotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class SequenceSum
{
	// Recursive function to print all combinations of numbers from `i` to `n`
	// having sum `n`. The `index` denotes the next free slot in the output array `out`
	public static void printCombinations(int i, int n, int[] out, int index) {
		if (n == 0) {
			System.out.println(Arrays.stream(out).limit(index)
					.boxed().collect(Collectors.toList()));
		}
		for (int j = i; j <= n; j++) {
			out[index] = j;
			printCombinations(j, n - j, out, index + 1);
		}
	}
	public static List<List<Integer>> getSumPaths(int number){

		if(number == 0){
			List<List<Integer>> lls = new ArrayList<>();
			lls.add(new ArrayList<>());
			return lls;
		}

		List<List<Integer>> toReturn = new ArrayList<>();
		for(int i = 1; i <= number; i++){
			List<List<Integer>> ret = getSumPaths(number - i);
			for(List<Integer> ls : ret){
				ls.add(i);
				toReturn.add(ls);
			}

		}
		return toReturn;
	}



	public static void main(String[] args) {
//		int n = 5;
//		int[] out = new int[n];
//		printCombinations(1, n, out, 0);
		System.out.println(getSumPaths(5));

	}
}