//Link:https://leetcode.com/contest/biweekly-contest-22/problems/sort-integers-by-the-power-value/
package leetCode.contest;

import java.util.*;

public class M_Biweekly1387 {

    public static int getKth(int lo, int hi, int k) {
        TreeMap<Integer,Integer> result = new TreeMap<>();
        for (int i = lo ; i <= hi; i++ ){
            result.put(i , powerOf(i));
        }
        int count =0;
        for (Map.Entry<Integer, Integer> entry  : entriesSortedByValues(result)) {
            count++;
            if ( count == k){
                return entry.getKey();
            }
        }
        return  0 ;
    }

    static <K,V extends Comparable<? super V>> SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<>(
                (Map.Entry<K, V> e1, Map.Entry<K, V> e2) -> {
                    int res = e1.getValue().compareTo(e2.getValue());
                    return res != 0 ? res : 1;
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
    private static int powerOf(int n){
        int steps =0;
        while ( n != 1){
            if ( n %2 == 0 ){
                n = n/2;
            }else {
                n = 3*n + 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(getKth(12,15,2));
    }
}
