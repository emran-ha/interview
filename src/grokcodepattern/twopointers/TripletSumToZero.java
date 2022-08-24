package grokcodepattern.twopointers;

import java.util.*;

class TripletSumToZero {

  public static List<List<Integer>> searchTriplets(int[] arr) {
    List<List<Integer>> triplets = new ArrayList<>();
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 2; i++) {
      if ( i > 0 && arr[i] == arr[i - 1]) {
        continue;
      }
      //System.out.println(i);
      search(arr, -arr[i], i + 1, triplets);
    }
    return triplets;
  }
  static void search(int[] arr, int target, int left, List<List<Integer>> triplet) {
    int right = arr.length - 1;
    while(left < right) {
      int sum = arr[right] + arr[left];
      if (target == sum){
        triplet.add(Arrays.asList(-target, arr[left], arr[right]));
        right--;
        left++;
      } else if(sum > target) {
        right--;
      } else {
        left++;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(TripletSumToZero.searchTriplets(new int[] { -3, 0, 1, 2, -1, 1, -2, 5, -5 }));
  }
}