package problemsolving.infotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class AnagramGroup {
    static List<List<String>> group(String[] arr){
        HashMap<String, List<String>> hashMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if (hashMap.containsKey(s)) {
                hashMap.get(s).add(arr[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(arr[i]);
                hashMap.put(s, list);
            }

        }
        for (String s : hashMap.keySet()) {
            result.add(hashMap.get(s));
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = new String[] {"art", "cheese", "cat", "rat", "tar", "act", "tca"};
        System.out.println(AnagramGroup.group(arr));
    }
}
