//Link: https://www.hackerrank.com/challenges/gem-stones/problem
package HackerRank_algorithms_String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class E_Gemstone {

    private static int gemstones(String[] arr) {
        ArrayList<Set<Character>> arrayList = new ArrayList<>();
        for (String s : arr) {
            HashSet<Character> hashSet = new HashSet<>();
            for (int j = 0; j < s.length(); j++)
                hashSet.add(s.charAt(j));
            arrayList.add(hashSet);
        }
        Set<Character> intersection = new HashSet<>(arrayList.get(0));
        for(int i = 1 ; i <arrayList.size(); i++){
            intersection.retainAll(arrayList.get(i));
        }
        return intersection.size();
    }

    public static void main(String[] args) {
        String[] arrayInput = new String[]{
                "abcdde", "baccd", "eeabg"
        };
        System.out.println(gemstones(arrayInput));
    }
}
