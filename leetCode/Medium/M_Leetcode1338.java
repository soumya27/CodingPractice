//Link:https://leetcode.com/problems/reduce-array-size-to-the-half/
package leetCode.Medium;

import java.util.*;

public class M_Leetcode1338 {

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<>(hm.entrySet());

        // Sort the list
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static int minSetSize(int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int value : arr){
            frequency.merge(value, 1, Integer::sum);
        }
        int length = arr.length;
        System.out.println(length);

        Map<Integer, Integer> sorted =sortByValue(frequency);

        int result = 0 ;
        int sum = 0;
        // we want half of this
        for (Integer key : sorted.keySet()){
            if (sum < length/2) {
                System.out.println(key + " " +sorted.get(key));
                result++;
                sum+=sorted.get(key);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minSetSize(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
