//https://leetcode.com/problems/increasing-decreasing-string/
package leetCode.contest;

import java.util.TreeMap;

public class E_Biweekly_IDString {

    public static String sortString(String s) {
        TreeMap<Character,Integer> freqMap = new TreeMap<>();
        StringBuilder result = new StringBuilder();
        for (int i =0 ; i < s.length(); i++){
            if( freqMap.get(s.charAt(i))!= null){
                freqMap.put(s.charAt(i),freqMap.get(s.charAt(i))+1);
            } else {
            freqMap.put(s.charAt(i),1);
            }
        }
        int remaining = s.length();
        int low= 0 ;
        int high= freqMap.size()-1;
        while (remaining >0){
            while ( !(low>freqMap.size()-1)){
                Character character = (Character) freqMap.keySet().toArray()[low];
                if (freqMap.get(character)!=0){
                    result.append(character);
                    freqMap.put(character,freqMap.get(character)-1);
                    remaining--;
                }
                low++;
            }
            low=0;
            while(high>=0){
                Character character = (Character)freqMap.keySet().toArray()[high];
                if (freqMap.get(character)!=0){
                    result.append(character);
                    freqMap.put(character, freqMap.get(character)-1);
                    remaining--;
                }
                high--;
            }
            high = freqMap.size()-1;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(sortString("leetcode"));
    }
}
