package algoeducative;

class MaxNumber {
    public static void findLargestNumber(int number_of_digits, int sum_of_digits ) {
      int n = number_of_digits;
      int s = sum_of_digits;
      if(s > 9 * n) {
        return;
      }
      int val = 0;
      while(s > 0){
        for (int i = 9; i >= 0 && n >= 0; i--){
          if(s - i >= 0){
              n--;
             s = s - i;
             val = val * 10 + i;
             break;
          }
        }
      }
      System.out.println(val);
  }

    public static void main(String[] args) {
        findLargestNumber(2, 9);
    }
}