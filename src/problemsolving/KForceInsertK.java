package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class KForceInsertK {
    static void insert(String str){
        StringBuilder s = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == 'f' || chars[i] == 'F'){
                s.append("kf");
            }else{
                s.append(chars[i]);
            }
        }
        System.out.println(s);
    }
    static void insertSplit(String str){
        String[] strings = str.split(" ");
        List<String> list = new ArrayList<>();
        for(String s : strings){
            list.add(s);
        }
        Collections.reverse(list);

        StringBuilder stringBuilder = new StringBuilder();
        list.stream().forEach(s -> stringBuilder.append(s+" "));
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        insertSplit("I am from Kabul");
        insertSplit("Trust me");
        insertSplit("this is good method");
    }
}
