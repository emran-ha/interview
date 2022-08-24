package problemsolving.infotech;

class ShortestSubArray {
    public static void findShortest(int[] arr, int k) {
        int windowStart = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum == k) {
                min = Math.min(min, i - windowStart);
            }
            sum += arr[i];
            while(sum > k) {
                sum -= arr[windowStart++];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        findShortest(new int[]{2, 5, 4, 6, 11, 4, 25}, 15);
        StringBuilder stringBuilder = new StringBuilder("ee");
        System.out.println(stringBuilder);

    }
}
