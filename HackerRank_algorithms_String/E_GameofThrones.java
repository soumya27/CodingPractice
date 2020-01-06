//Link: https://www.hackerrank.com/challenges/game-of-thrones/problem
package HackerRank_algorithms_String;

import java.util.HashMap;

public class E_GameofThrones {

    static String gameOfThrones(String s) {
        HashMap<Character,Integer> count = new HashMap<>();
        int len = s.length();
        //count occurrence of characters in string
        for(int i= 0 ; i<len;i++){
            if(count.containsKey(s.charAt(i))){
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }
            else{
                count.put(s.charAt(i),1);
            }
        }
        // if even length
        boolean flag = true;
        int counter=0;
        for (Integer value : count.values()) {
            if(len %2 ==0 ){ // even length
               if(value%2 !=0){ // all should be even count
                   flag = false;
               }
            }else {
                if(value%2 !=0 ){
                    counter++;
                }
            }
        }
        if(len%2 != 0 && counter == 1 || len%2 ==0 && flag){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        String input = "ccddf";
        System.out.println(gameOfThrones(input));
    }
}
