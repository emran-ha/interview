package problemsolving;

import java.util.*;
import java.util.stream.Collectors;


class TwoGreatNumber {

    static void getGreatNumber(int[] arr, int k){
        Map<Integer, Integer> counter = new HashMap<>();
        Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int a : arr){
            counter.put(a, counter.getOrDefault(a, 0) + 1);
        }

        System.out.println(counter);
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        Integer key = 0;
        for (int i = 0; i < k; i++){
            for(Map.Entry<Integer, Integer> f : counter.entrySet()){
                if(f.getValue() > max){
                    max = f.getValue();
                    key = f.getKey();
                }
            }
            list.add(key);
            counter.remove(key);
            max = Integer.MIN_VALUE;
        }
        System.out.println(counter);
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] arr = {4,53,23,4,4,53,444,444,4,4,53};
        getGreatNumber(arr, 3);

    }
}
