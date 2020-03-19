//Link:https://leetcode.com/problems/split-a-string-in-balanced-strings/
package leetCode.Easy;

public class E_Leetcode1221 {
    public static int balancedStringSplit(String s) {
        int result= 0 ;
        int LCount= 0;
        for (int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) == 'L')
                LCount++;
            else
                LCount--;
            if (LCount == 0)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));

        System.out.println();

    }
}
