//Link:https://leetcode.com/problems/longest-substring-without-repeating-characters/
package leetCode.Medium;

public class M_Leetcode3 {

        public int lengthOfLongestSubstring(String s) {
            while(s.length()>0) {
                int max = 1;
                int windowStart = 0;
                int windowEnd = 1; // this index is not included
                String window = s.substring(windowStart,windowEnd);
                for(int i =1; i< s.length();i++){
                    String current = Character.toString(s.charAt(i));
                    window = s.substring(windowStart,windowEnd);
                    if(window.contains(current)){
                        // find index of char and change the windowStart
                        windowStart += window.indexOf(current)+1;
                    }
                    windowEnd++;
                    //compare substring length and max
                    max = Math.max(window.length(), max);
                }
                window = s.substring(windowStart,windowEnd);
                max = Math.max(window.length(), max);
                return max;
            }

            return 0;
        }
}
