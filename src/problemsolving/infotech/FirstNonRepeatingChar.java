package problemsolving.infotech;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class FirstNonRepeatingChar {
    static void FirstChar(String s) {
        int counter = 1;
        int count = 0;
        char c = 0;
        for (int i = 0; i < s.length() - 1; i++){
            counter = i + 1;
            while(counter < s.length()) {
                if(s.charAt(i) == s.charAt(counter)) {
                    count = 0;
                    break;
                } else {
                    count++;
                    c = s.charAt(i);
                }
                counter++;
            }
            if (count > 0) {
                System.out.println(c);
                break;
            }
        }

    }

    static void findFirst(String s) {
        Map<Character, Integer> counter = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> val : counter.entrySet()) {
            if (val.getValue() == 1) {
                System.out.println(val.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        FirstChar("radcecar");
        findFirst("radcecar");
    }
}
