//Link:https://www.hackerrank.com/challenges/funny-string/problem
package HackerRank_algorithms_String;

public class E_FunnyString {

    static String funnyString(String s) {
        StringBuilder reverse = new StringBuilder(s);
        reverse = reverse.reverse();
        for(int i=1; i<s.length();i++){
            if(Math.abs(s.charAt(i)-s.charAt(i-1)) != Math.abs(reverse.charAt(i)-reverse.charAt(i-1))){
                return "Not Funny";
            }
        }
        return "Funny";
    }

    public static void main(String[] args) {
        System.out.println(funnyString("lmnop"));
        System.out.println(funnyString("acxz" ));
        System.out.println(funnyString("bcxz"));
    }
}
