//Link:https://leetcode.com/problems/top-k-frequent-elements/
package leetCode.Medium;

import java.util.*;
import java.util.stream.Collectors;

public class M_Leetcode347 {


    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        for(int number : nums){
            frequencyMap.merge(number, 1, Integer::sum);
        }

        System.out.println(frequencyMap.toString());
        Map<Integer, Integer> sortedMap =
                frequencyMap.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        
        System.out.println(sortedMap.toString());

        List<Integer> result = new ArrayList<>();
        for( int i = 0 ; i < k ; i++){
            result.add((Integer) sortedMap.keySet().toArray()[i]);
        }
        return result;
    }



    public static void main(String[] args) {
        int[] input = new int[]{4,1,-1,2,-1,2,3};
        int k =2;
        for(int value : new M_Leetcode347().topKFrequent(input,k) ){
            System.out.println(value);
        }
    }
}
