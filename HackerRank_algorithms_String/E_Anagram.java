//Link:https://www.hackerrank.com/challenges/anagram/problem
package HackerRank_algorithms_String;

import java.util.Collections;
import java.util.HashMap;

public class E_Anagram {

    static int anagram(String input) {
        int len = input.length();
        if(len%2!= 0)
            return -1;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        StringBuilder string1 = new StringBuilder(input.substring(0,len/2));
        StringBuilder string2 = new StringBuilder(input.substring(len/2,len));
        buildMap(string1.toString(),hashMap);
        System.out.println(Collections.singletonList(hashMap));
        int count = 0 ;
        int secondCount = string1.length() ;
        for(int i =0 ; i <string2.length();i++){
            if (hashMap.get(string2.charAt(i))!= null && hashMap.get(string2.charAt(i))!=0){
                hashMap.put(string2.charAt(i),hashMap.get(string2.charAt(i))-1);
                secondCount--;
            }else {
                count++;
            }
        }
        if(count == secondCount)
            return count;
        else
            return -1;
    }

    private static void buildMap(String input, HashMap<Character,Integer> map){
        for(int i=0;i<input.length();i++){
            if(map.get(input.charAt(i)) != null){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            }else {
                map.put(input.charAt(i), 1);
            }
        }
    }

    public static void main(String[] args) {
        String input = "mnop";
        System.out.println(anagram(input));
    }
}
