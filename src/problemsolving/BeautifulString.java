package problemsolving;

import java.util.*;
import java.util.stream.Collectors;

class BeautifulString {
    boolean isBeautiful(String s){
        int[] chars = new int[26];
        for(char ch : s.toCharArray()){
            chars[(int)ch - 'a']++;
        }
        System.out.println(Arrays.toString(chars));
        for (int i = 1; i < chars.length; i++){
            if (chars[i-1] < chars[i]){
                return false;
            }
        }
        return true;
    }

    boolean isBeautifulMap(String s){
       LinkedHashMap<Character, Integer> chars = new LinkedHashMap<>();
       for (Character ch = 'a'; ch < 'z'; ch++){
           chars.put(ch, 0);
       }
      /* for(Map.Entry<Character, Integer> j : chars.entrySet()){
           System.out.println(j.getKey()+" "+j.getValue());
        }*/
       for(Character c : s.toCharArray()){
           chars.put(c, chars.get(c) + 1);
       }
        System.out.println(chars);
        List<Integer> list = chars.values().stream().collect(Collectors.toList());
       for(int i = 1; i < list.size(); i++){
           if(list.get(i - 1) < list.get(i)){
               return false;
           }
       }
        return true;
    }

    public static void main(String[] args) {
        BeautifulString bs =  new BeautifulString();
        System.out.println(bs.isBeautiful("bbbaaecadef"));
        System.out.println(bs.isBeautifulMap("abc"));

    }
}
