//Link:https://www.hackerrank.com/challenges/making-anagrams/problem
package HackerRank_algorithms_String;

import java.util.HashMap;

public class E_MakingAnagram {


    private static int makingAnagrams(String s1, String s2) {
        HashMap<Character,Integer> input1 = new HashMap<>();
        HashMap<Character,Integer> input2 = new HashMap<>();
        buildMap(s1,input1);
        buildMap(s2,input2);
        int count=0 ;
        for( Character key : input1.keySet()){
            if(input2.get(key) != null){
                count += Math.abs(input1.get(key)-input2.get(key));
                input2.remove(key);
            }else{
                count+=input1.get(key);
            }
        }
        for(Character key : input2.keySet()){
            count += input2.get(key);
        }
        return count;
    }

    private static void buildMap(String input,HashMap<Character,Integer>map){
        for(int i=0;i<input.length();i++){
            if(map.get(input.charAt(i)) != null){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            }else {
                map.put(input.charAt(i), 1);
            }
        }
    }

    public static void main(String[] args) {
        String input1 = "absdjkvuahdakejfnfauhdsaavasdlkj";
        String input2 = "djfladfhiawasdkjvalskufhafablsdkashlahdfa";
        System.out.println(makingAnagrams(input1,input2));
    }
}
