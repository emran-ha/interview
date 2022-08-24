package sorting;

import java.util.Arrays;

class InsertionSort {
    int[] sort(int[] arr){
        int ele, j;
       for (int i = 1; i < arr.length; i++){
           ele = arr[i];
           j = i -1;
           while (j >= 0 && arr[j] > ele){
               arr[j + 1] = arr[j];
               j = j - 1;
           }
           arr[j + 1] = ele;
       }
        return arr;
    }

    public static void main(String[] args) {
        int[] val = {2, 0, 0, 45, 23, 11, 10, 12, 19};
        val = new InsertionSort().sort(val);
        Arrays.stream(val).forEach(s -> System.out.print(s+" "));
    }

}
