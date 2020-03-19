//Link:https://www.hackerrank.com/contests/hack-the-interview-u-s-2/challenges/high-security-strings
package InterviewPrep_HackerRank;

public class E_HighSecurityStrings {

    public static int getStrength(String password, int weight_a) {
        int strength = 0 ;
        for (int i = 0 ; i < password.length();i++){
            int charPos = password.charAt(i)%97;
            strength +=((weight_a+charPos) %26);
        }
        return strength;
    }
    public static void main(String[] args) {
        String input ="aaaaa";
        int weight = 1;
        System.out.println(getStrength(input,weight));
    }
}
