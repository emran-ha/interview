package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ReverseStringWords {
    static public String reverseWords(String s) {
        String[] arr = s.split(" ");
        List<String> list;
        list = Arrays.stream(arr)
                .filter(space -> !space.isEmpty())
                .collect(Collectors.toList());
        Collections.reverse(list);
        StringBuilder stringBuilder = new StringBuilder();
        for(String st: list){
            stringBuilder.append(st);
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }

    static String revWords(String s) {
        String[] arr = s.split("\\s+");
        List<String> list = Arrays.stream(arr).collect(Collectors.toList());
        Collections.reverse(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (String st : list) {
            stringBuilder.append(st);
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = revWords("a good   example   ");
        System.out.println(s);
    }
}
