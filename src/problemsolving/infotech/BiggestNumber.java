package problemsolving.infotech;

import java.util.*;

class BiggestNumber {
    static void create(int[] arr){
        String[] str = Arrays.stream(arr).
                mapToObj(s -> String.valueOf(s)).toArray(String[]::new);
        class sorter implements Comparator<String> {
            @Override
            public int compare(String s, String t){
                String str1 = s + t;
                String str2 = t + s;
                return str2.compareTo(str1);
            }
        }
        Arrays.sort(str, new sorter());
        StringBuilder sb = new StringBuilder();
        Arrays.stream(str).forEachOrdered(s -> sb.append(s));
        System.out.println(sb);
    }
    public static void main(String[] args) {
        create(new int[]{1,34, 3, 98, 9, 76, 45, 4});
        create(new int[]{9,98});
    }
}
