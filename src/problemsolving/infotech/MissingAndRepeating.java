package problemsolving.infotech;

import java.util.Arrays;
import java.util.HashMap;

class MissingAndRepeating {

        static void find(int[] arr) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {

               if(hashMap.get(arr[i]) == null) {
                   hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
               } else {
                   System.out.println(arr[i] + " Repeating");
               }
            }
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] != 1) {
                    System.out.println(arr[i]+ 1 +" missing");
                    break;

                }
            }
            System.out.println(hashMap);
        }

    public static void main(String[] args) {
        find(new int[]{2, 3, 4, 4, 5, 6});
    }
}
