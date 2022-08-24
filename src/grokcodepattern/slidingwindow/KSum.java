package grokcodepattern.slidingwindow;

import java.util.Arrays;

class KSum {
    static double[] sum(int[] arr, int k){
        if(k > arr.length - 1){
            return new double[]{};
        }
        double[] result = new double[arr.length - k + 1];
        int windowStart = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(i >= k - 1){
                result[windowStart] = sum / k;
                sum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[] arr = sum(new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 }, 5);
        System.out.println(Arrays.toString(arr));
    }
}
