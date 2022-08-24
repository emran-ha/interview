package sorting;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class SelectionSortGenerics {
    <T extends Comparable<T>> int findMinIndex(List<T> arr, int start, int end){
        if(end <= 0 || start < 0){
            return 0;
        }
        int minIndex = start;
        for (int i = start + 1; i <= end; i++){
            if(arr.get(i).compareTo(arr.get(minIndex)) <= 0){
                minIndex = i;
            }
        }
        return minIndex;
    }

    <T extends Comparable<T>> List<T> sortAscending(List<T> arr){
        for (int i = 0; i < arr.size(); i++){
            int minIndex = findMinIndex(arr, i, arr.size() - 1);
            T temp = arr.get(i);
            arr.set(i, arr.get(minIndex));
            arr.set(minIndex, temp);
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSortGenerics selectionSortGenerics = new SelectionSortGenerics();
        Integer[] val = new Integer[] {1, 43, -23, 0, 98, 93, 0, 56};
        List<Integer> list = Arrays.asList(val);
        selectionSortGenerics.sortAscending(list);
        System.out.println(list);
        List<String> names = Arrays.asList("Emo", "Faisal", "Khomari", "Hamed", "Zubair", "Nawaby", "John");
        selectionSortGenerics.sortAscending(names);
        System.out.println(names);
    }
}
