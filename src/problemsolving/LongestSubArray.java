package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class LongestSubArray {
     static void subString(List<Integer> arr){
         List<Integer> max = new ArrayList<>();
         List<Integer> currMax = new ArrayList<>();
         max.add(arr.get(0));
         currMax.add(arr.get(0));
         for (int i = 1; i < arr.size(); i++){
             if(((Math.abs(arr.get(i) - arr.get(i - 1)) == 1) || (Math.abs(arr.get(i) - arr.get(i - 1)) == 0))){
                 currMax.add(arr.get(i));
             }else{
                 if(max.size() < currMax.size()){
                     max.clear();
                     max.addAll(currMax);
                     currMax.clear();
                 }
                 currMax.clear();
                 currMax.add(arr.get(i));
             }
             if(currMax.size() > max.size()){
                 max.clear();
                 max.addAll(currMax);
             }

         }
         System.out.println(max);
         System.out.println(max.size());
     }

    public static void main(String[] args) {
        subString(Arrays.asList(1,2,3,3,3,34));

    }
}
