//https://www.hackerrank.com/challenges/reduced-string/problem
package HackerRank_algorithms_String;

public class E_ReducedString {

    static String superReducedString(String stringValue) {
        StringBuffer s = new StringBuffer(stringValue);
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                s.delete(i-1, i+1);
                i = 0;
            }
        }
        if(s.length() == 0)
            return  "Empty String";
        else
            return s.toString();

    }

    public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd"));
        System.out.println(superReducedString("aa"));
        System.out.println(superReducedString("baab"));
    }
}
