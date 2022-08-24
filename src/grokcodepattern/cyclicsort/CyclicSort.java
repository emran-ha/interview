package grokcodepattern.cyclicsort;

import java.util.Arrays;

class CyclicSort {
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = arr[i] - 1;
            if (arr[i] != arr[j]) {
                swap(arr, i, j);
            } else {
                i++;
            }
            //System.out.println(Arrays.toString(arr));
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int a[] = {5, 4, 2, 3, 1, 6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
