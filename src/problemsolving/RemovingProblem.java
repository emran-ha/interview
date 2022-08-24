package problemsolving;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class RemovingProblem {
    static void remove(){

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for (String s : list){
            if(s.equals("c")){
                list.remove(s);
            }
        }
        System.out.println(list);
    }
    static void sorting(){
        List<Integer> list =  new ArrayList<>();
        list.add(23);
        list.add(44);
        list.add(65);
        list.add(2);
        list.add(11);
        list.add(38);
        System.out.println(list);
        Collections.sort(list, (a,b) -> (b-a));
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }

    public static void main(String[] args) {
        remove();
        sorting();
    }
}
