package sorting;

import java.util.Arrays;

class BubbleSort {
    int[] sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] val = {2, 0, 0, 45, 23, 11, 10, 12, 19};
        val = new BubbleSort().sort(val);
        Arrays.stream(val).forEach(s -> System.out.print(s+" "));
    }
}
