//Link: https://www.hackerrank.com/challenges/string-construction/problem
package HackerRank_algorithms_String;

import java.util.ArrayList;

public class E_StringConstruction {

    private static int stringConstruction(String s) {
        ArrayList<Character> result= new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if(!result.contains(s.charAt(i))){
                result.add(s.charAt(i));
            }
        }
        return result.size();
    }

    public static void main(String[] args) {
        String input = "abab";
        System.out.println(stringConstruction(input));
    }
}
