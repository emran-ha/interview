package problemsolving;

import javax.swing.text.html.parser.Entity;
import java.util.*;

class SortingMap {
    static HashMap<Integer, Integer> sort(HashMap<Integer, Integer> unsorted){
        HashMap<Integer, Integer> sorted = new LinkedHashMap<>();
        unsorted.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));
        return sorted;
    }
    static HashMap<String, Integer> sortWithList(HashMap<String, Integer> unsorted){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(unsorted.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        HashMap<String, Integer> sorted = new LinkedHashMap<>();
        list.stream().forEach(x -> sorted.put(x.getKey(), x.getValue()));
        return sorted;
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 12);
        hm.put(45, 11);
        hm.put(12, 27);
        hm.put(89, 1);
        hm.put(33, 9);
        System.out.println(hm);
        hm = sort(hm);
        System.out.println(hm);
        HashMap<String, Integer> shm = new HashMap<>();
        shm.put("Ahmad", 100);
        shm.put("John", 129);
        shm.put("Mike", 13);
        shm.put("Sam", 27);
        shm.put("Mado", 44);
        System.out.println(shm);
        shm = sortWithList(shm);
        System.out.println(shm);
    }
}
