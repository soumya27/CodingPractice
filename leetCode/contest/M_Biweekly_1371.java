package leetCode.contest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class M_Biweekly_1371 {
    final static Set<Character> vowels = new HashSet<>();

    static {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
    }

    public int findTheLongestSubstring(String s) {
        final Map<Integer, Integer> map = new HashMap<>();
        int longest = 0, bitmap = 0, len = s.length();
        map.put(0, 0);

        for(int i = 0; i < len; ++i) {
            char ch = s.charAt(i);

            if(vowels.contains(ch))
                bitmap = bitmap ^ (1 << (ch - 'a'));

            if(bitmap == 0){
                longest = i + 1;
            }else {
                int index = map.getOrDefault(bitmap, -1);
                if(index == -1){
                    map.put(bitmap, i);
                }else {
                    longest = Math.max(longest, i - index);
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(new M_Biweekly_1371().findTheLongestSubstring("eleetminicoworoep"));
    }
}
