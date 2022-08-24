package problemsolving.infotech;

import java.util.Arrays;

class MergeTwoSorted {

    static void sort(int[] arr1, int[] arr2) {
        int s1 = arr1.length;
        int s2 = arr2.length;
        int[] copy = new int[s1 + s2];
        int i = 0, j = 0, k = 0;
        while(i < s1 && j < s2) {
            if (arr1[i] < arr2[j]) {
                copy[k++] = arr1[i++];
            } else {
                copy[k++] = arr2[j++];
            }
        }

        while (i < s1) {
            copy[k++] = arr1[i++];
        }
        while (j < s2) {
            copy[k++] = arr2[j++];
        }
        Arrays.stream(copy).forEachOrdered(x -> System.out.print(x + " "));
    }

    public static void main(String[] args) {
        sort(new int[]{5, 8, 9}, new int[]{4, 7, 8});
    }
}
