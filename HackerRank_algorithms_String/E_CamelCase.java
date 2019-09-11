//https://www.hackerrank.com/challenges/camelcase/problem
package HackerRank_algorithms_String;

public class E_CamelCase {
    static int camelcase(String s) {
        int result =0;
        for(int i =0 ;i < s.length(); i++) {
            if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90)
                result++;
        }
        result++;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
}
