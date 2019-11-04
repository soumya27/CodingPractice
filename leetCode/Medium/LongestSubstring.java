package leetCode.Medium;
//Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/
import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
//        while(s.length()>0) {
//            int max = 1;
//            int windowStart = 0;
//            int windowEnd = 1; // this index is not included
//            String window = s.substring(windowStart,windowEnd);
//            for(int i =1; i< s.length();i++){
//                String current = Character.toString(s.charAt(i));
//                window = s.substring(windowStart,windowEnd);
//                if(window.contains(current)){
//                    // find index of char and change the windowStart
//                    windowStart += window.indexOf(current)+1;
//                }
//                windowEnd++;
//                //compare substring length and max
//                max = Math.max(window.length(), max);
//            }
//            window = s.substring(windowStart,windowEnd);
//            max = Math.max(window.length(), max);
//            return max;
//        }
//
//        return 0;

        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.lengthOfLongestSubstring("aaaaaaac"));
    }
}
