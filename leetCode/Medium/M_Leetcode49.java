//Link:https://leetcode.com/problems/group-anagrams/
package leetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class M_Leetcode49 {

    public List<List<String >>  groupAnagrams(String[] strs) {
        HashMap<String, List<String>>  inputDetail = new HashMap<>();
        List<List<String >> result = new ArrayList<>();
        for(String input : strs){
            char[] inputChar = input.toCharArray();
            Arrays.sort(inputChar);
            String sortedInput = new String(inputChar);

            if (inputDetail.get(sortedInput)!= null){
                inputDetail.get(sortedInput).add(input);
            } else{
               List<String> inputList = new ArrayList<>();
               inputList.add(input);
               inputDetail.put(sortedInput,inputList);
            }
        }

        for (String key : inputDetail.keySet()){
            result.add(inputDetail.get(key));
        }
        return result;
    }

    public static void main(String[] args) {
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        new M_Leetcode49().groupAnagrams(input);
    }
}
