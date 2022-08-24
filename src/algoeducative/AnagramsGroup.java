package algoeducative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class AnagramsGroup {
 public static String groupAnagrams(String arr[]) {
  HashMap < String, List< String >> myMap = new HashMap< >();

  for (int i = 0; i < arr.length; i++) {
   String word = arr[i];
   char[] letters = word.toCharArray();
   Arrays.sort(letters);
   String newWord = new String(letters);
   if (myMap.containsKey(newWord))
    myMap.get(newWord).add(word);
   else {
    List < String > totalWords = new ArrayList< >();
    totalWords.add(word); // Add words for the specific hashcode  
    myMap.put(newWord, totalWords);
   }
  }
  String anagrams = "";
  for (String s: myMap.keySet())
  {
   List < String > values = myMap.get(s);
   if (values.size() > 1)
    anagrams = anagrams + values;
  }
  return anagrams;
 }

 public static void main(String[] args) {
  String[] input = {"cat", "dog", "tac", "god", "act", "tom marvolo riddle" ,"abc", "def",
          "cab", "fed", "clint eastwood" , "i am lord voldemort", "elvis", "old west action",  "lives"
  };
  String res = groupAnagrams(input);
  System.out.println(res);
 }
}