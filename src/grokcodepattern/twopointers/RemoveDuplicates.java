package grokcodepattern.twopointers;

class RemoveDuplicates {

  public static int remove(int[] arr) {
    int j = 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[j - 1] != arr[i]) {
        arr[j] = arr[i];
        j++;
      }
    }

    return j;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
    System.out.println(RemoveDuplicates.remove(arr));

    arr = new int[] { 2, 2, 2, 11 };
    System.out.println(RemoveDuplicates.remove(arr));
  }
}