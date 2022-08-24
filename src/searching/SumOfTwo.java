package searching;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

class SumOfTwo {
    int[] sum(int[] arr, int n){
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(hm.containsKey(arr[i])){
                return new int[]{arr[i], n - arr[i]};
            }else{
                hm.put(n - arr[i], true);
            }
        }

        System.out.println();
        return new int[]{};
    }
    int[] sumBySort(int[] arr, int n){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int found = search(arr, n - arr[i]);
            if(found != -1){
                return new int[]{arr[i], arr[found]};
            }
        }
        return arr;
    }

    int search(int[] arr, int n){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(arr[mid] == n){
                return mid;
            }else if(n > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SumOfTwo sum = new SumOfTwo();
        int[] arr = new int[]{2, 25, 60, 88, 21, 45, 12};
        int a[] = sum.sum(arr, 81);
        Arrays.stream(a).forEach(s -> System.out.print(s+" "));
        System.out.println();
        int b[] = sum.sumBySort(arr,81);
        Arrays.stream(b).forEach(s -> System.out.print(s+" "));





    }
}
