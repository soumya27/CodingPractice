//Link:https://www.hackerrank.com/challenges/alternating-characters/problem
package HackerRank_algorithms_String;

public class E_AlternatingString {

    private static int alternatingCharacters(String s) {
        int dCount=0;
        int j=0;
        for( int i =1 ; i <s.length();i++){
            if(s.charAt(i-1) == s.charAt(i))
                dCount++;
            else
                j+=dCount;
        }
        return dCount;
    }


    public static void main(String[] args) {
        String[] inputArray = new String[] {
                "AAAA","BBBBB","ABABABAB","BABABA","AAABBB"
        };

        for (String input : inputArray){
            System.out.println(alternatingCharacters(input));
        }
    }

}
