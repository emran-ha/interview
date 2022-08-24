package problemsolving.infotech;

import java.util.Arrays;

class InsertToSortedArr {
    static int[] insert(int[] arr, int n, int capacity, int value) {
        if (capacity <= n)
            return arr;
        int i;
        for (i = n - 1; (i >= 0 && arr[i] > value); i--)
            arr[i + 1] = arr[i];
        arr[i + 1] = value;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 12;
        arr[4] = 14;
        insert(arr, 5, arr.length, 11);
        System.out.println(Arrays.toString(arr));
    }
}
