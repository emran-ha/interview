package searching;

import java.util.Arrays;

class BinarySearch {
    int search(int[] arr, int val){
        if(arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end){
            mid = (start + end) / 2;
            if(arr[mid] == val){
                return mid;
            } else if(val > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch =  new BinarySearch();
        int[] arr = {27, 29, 30, 31};
        int val = binarySearch.search(arr, 31);
        if(val > -1){
            System.out.println("Value found " + arr[val]);
        }else {
            System.out.println("Value not found");
        }
    }
}
