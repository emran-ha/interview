package algoeducative;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
class Duplicates {
 public static List<Integer> findDuplicates(int[] arr) {
  List< Integer > duplicates = new ArrayList <> ();
  duplicates.add(Integer.MIN_VALUE); // placeholder value

  // write your code here
  HashMap<Integer,Integer> counter = new HashMap<>();
  for(int i = 0; i < arr.length; i++){
      counter.put(arr[i], counter.getOrDefault(arr[i], 0) + 1);
  }
  duplicates = counter.keySet().stream()
                .filter(s -> counter.get(s) > 1)
                .collect(Collectors.toList());

  return duplicates;
 }

 public static void main(String[] args) {
  List<Integer> list =  findDuplicates(new int[]{3,3,4,2,4,100,111,100});
  System.out.println(list);
 }
}