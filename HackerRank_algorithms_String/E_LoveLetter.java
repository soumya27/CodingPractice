//Link:https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
package HackerRank_algorithms_String;

public class E_LoveLetter {
    static int theLoveLetterMystery(String s) {
        int i =0, j = s.length()-1;
        int count=0;
        while(i<j){
            count += Math.abs(s.charAt(i)-s.charAt(j));
            i++;
            j--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abcd"));
        System.out.println(theLoveLetterMystery("abcba"));
        System.out.println(theLoveLetterMystery("abc"));
    }
}
