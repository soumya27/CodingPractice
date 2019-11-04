//Link:https://leetcode.com/problems/palindrome-number/
package leetCode.Easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if( x<0 ){
            return false;
        }
        else {
            int rev = 0;
            int n =x;
            while (n>0){
                int last = n%10;
                n = n/10;
                rev =rev*10+last;
            }
            if (rev==x)
                return true;
        }
        return false;
    }
}
