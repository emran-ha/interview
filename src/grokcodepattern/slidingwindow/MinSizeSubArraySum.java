package grokcodepattern.slidingwindow;

class MinSizeSubArraySum {
  public static int findMinSubArray(int S, int[] arr) {
    // TODO: Write your code here
    int sum = 0;
    int start = 0;
    int minLength = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++){
      sum += arr[i];
      while(sum >= S){
        minLength = Math.min(minLength, i - start + 1);
        sum -= arr[start];
        start++;
      }
    }
    return minLength == Integer.MAX_VALUE ? 0 : minLength;
  }

  public static void main(String[] args) {
    findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2});
  }
}
