package leetCode.Medium;

import java.util.HashMap;

public class M_Leetcode1400 {
    public static boolean canConstruct(String s, int k) {
        HashMap<Character,Integer> frequency = new HashMap<>();
        for (Character character : s.toCharArray()){
            frequency.merge(character, 1, Integer::sum);
        }
        for (Character key : frequency.keySet())
            System.out.println(key+" : "+frequency.get(key));
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("leetcode", 2));
    }
}
