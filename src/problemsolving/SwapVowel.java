package problemsolving;

import java.util.*;

public class SwapVowel {

    static void swap(String st){

        String vowels = "aeiouAEIOU";
        char[] chars = st.toCharArray();
        int j = chars.length-1;
        int i = 0;
        while (i < j){
            if(vowels.contains(String.valueOf(chars[i]))){
                if(vowels.contains(String.valueOf(chars[j]))){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else {
                i++;
            }

        }
        StringBuilder builder = new StringBuilder(String.valueOf(chars));
        System.out.println(builder);

    }

    static String swapWithSet(String s){
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int i = 0;
        int j = s.length() - 1;
        StringBuilder stringBuilder = new StringBuilder(s);
        while (i < j){
            while (i < j && !set.contains(s.charAt(i))) i++;
            while (j > i && !set.contains(s.charAt(j))) j--;
            System.out.println(i+" "+j);
            stringBuilder.setCharAt(i,s.charAt(j));
            stringBuilder.setCharAt(j,s.charAt(i));
            i++;
            j--;
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        swapWithSet("Testing");
    }
}
