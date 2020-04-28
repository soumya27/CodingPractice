//Link:https://leetcode.com/problems/valid-parenthesis-string/

//Input: "()"
//Output: True
//Input: "(*)"
//Output: True

package leetCode.Medium;

public class M_Leetcode678 {

    public static boolean checkValidString(String s) {
        char[] array = s.toCharArray();
        int balance = 0 ;

        for (char c : array) {
            if (c == '(' || c == '*')
                balance++;
            else if (--balance < 0) {
                return false;
            }
        }
        balance = 0 ;
        for (int i = array.length-1; i>=0;i--){
            if (array[i]==')'|| array[i]=='*')
                balance++;
            else if (--balance<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkValidString("(*)"));
        System.out.println(checkValidString("()"));
        System.out.println(checkValidString("((*"));
    }
}
