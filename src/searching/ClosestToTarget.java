package searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClosestToTarget {
    /**
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     */
    public static int closestNumber(int[] A, int target) {
        // Write your code here
        if (A == null || A.length == 0) {
            return -1;
        }
        int start = 0;
        int end = A.length - 1;
        while (start + 1 < end) {
            int mid = (start + end) / 2;
            if (A[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        int left = Math.abs(A[start] - target);
        int right = Math.abs(A[end] - target);
        if (left <= right) {
            return A[start];
        } 
        return A[end];
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 13, 21, 33,34};
        System.out.println(closestNumber(arr, 12));


    }
}