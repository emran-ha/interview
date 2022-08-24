package problemsolving.infotech;


import java.util.HashMap;
import java.util.Map;

class SecondMostRepeated {
 static void sequence(String[] str) {
    HashMap<String, Integer> hm = new HashMap<>();
    for (int i = 0; i < str.length; i++) {
      hm.put(str[i], hm.getOrDefault(str[i], 0) + 1);
    }
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    String s = null;
    String t = null;
    for (Map.Entry<String, Integer> mp : hm.entrySet()) {
       if (mp.getValue() > first) {
        second = mp.getValue();
        t = s;
        first = mp.getValue();
        s = mp.getKey();
       } else {
        second = mp.getValue();
        t = mp.getKey();
       }
    }
  System.out.println(first +" "+ s);
  System.out.println(second +" "+ t);
 }

 public static void main(String[] args) {
  sequence(new String[]{"aaa", "bbb", "ccc", "bbb" ,"aaa", "aaa"});
 }
}
