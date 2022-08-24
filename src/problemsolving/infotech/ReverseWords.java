package problemsolving.infotech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ReverseWords {
    static void reverse(String sentence) {
        String[] arr = sentence.split("\\s+");
        System.out.println(Arrays.toString(arr));
        List<String> list = Arrays.stream(arr).collect(Collectors.toList());
        Collections.reverse(list);
        arr = list.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        reverse("IAM   FROM KABUL   AFGHANISTAN");
    }
}
