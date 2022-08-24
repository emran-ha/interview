package grokcodepattern.twopointers;

import java.util.Arrays;

class SortedArraySquares {

  public static int[] makeSquares(int[] arr) {
    int n = arr.length;
    int[] output = new int[n];
    int left = 0, right = arr.length - 1;
    System.out.println(right);
    int indx = n - 1;
    while(left <= right){
      int lsq = arr[left] * arr[left];
      int rsq = arr[right] * arr[right];
      if (lsq > rsq){
        output[indx--] = lsq;
        left++;
      } else {
        output[indx--] = rsq;
        right--;
      }
    }
    return output;
  }

  public static void main(String[] args) {
    int arr[] = makeSquares(new int[]{-1, 2, 4, -2, -3});
    System.out.println(Arrays.toString(arr));
  }
}