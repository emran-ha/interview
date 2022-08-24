package sorting;

import java.util.Arrays;
import java.util.List;

class SelectionSort {
    List<Integer> sortAscending(List<Integer> arr){
        for (int i = 0; i < arr.size(); i++){
            int minIndex = findMinIndex(arr, i, arr.size() - 1);
            int temp = arr.get(i);
            arr.set(i, arr.get(minIndex));
            arr.set(minIndex, temp);
        }
        return arr;
    }

    int findMinIndex(List<Integer> arr, int start, int end){
        if(end <= 0 || start < 0){
            return 0;
        }
        int minIndex = start;
        for (int i = start + 1; i <= end; i++){
            if(arr.get(i) > arr.get(minIndex)){
                minIndex = i;
            }
        }

        return minIndex;
    }
    List<Integer> sortDescending(List<Integer> arr){
        for (int i = 0; i < arr.size(); i++){
            int maxIndex = findMaxIndex(arr, i, arr.size() - 1);
            int temp = arr.get(i);
            arr.set(i, arr.get(maxIndex));
            arr.set(maxIndex, temp);
        }
        return arr;
    }

    int findMaxIndex(List<Integer> arr, int start, int end){
        if(end <= 0 || start < 0){
            return 0;
        }
        int maxInd = start;
        for (int i = start + 1; i <= end; i++){
            if(arr.get(i) < arr.get(maxInd)){
                maxInd = i;
            }
        }

        return maxInd;
    }



    public static void main(String[] args) {
        Integer[] val = new Integer[] {1, 43, -23, 0, 98, 93, 0, 56};
        List<Integer> list = Arrays.asList(val);
        SelectionSort selectionSort = new SelectionSort();
        list = selectionSort.sortAscending(list);
        list.forEach(s -> System.out.print(s+" "));
        System.out.println();
        list = selectionSort.sortDescending(list);
        list.forEach(s -> System.out.print(s+" "));
    }
}
