package problemsolving.infotech;

import java.util.HashMap;

class LengthOfLongestSubString {
    static int lengthOfLongestSubstring(String s) {
      
        int left = 0;
        int right = 0;
        int res = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while (right < s.length()) {
            char r = s.charAt(right);
            hm.put(r, hm.getOrDefault(r, 0) + 1);
            
            while (hm.get(r) > 1) {
                char l = s.charAt(left);
                hm.put(l, hm.get(l) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}