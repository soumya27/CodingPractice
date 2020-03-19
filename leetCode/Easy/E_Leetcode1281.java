//Link:https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
package leetCode.Easy;

public class E_Leetcode1281 {
    public static int subtractProductAndSum(int n) {
        int num = n ;
        int sum =0 , product = 1;
        while (num >0 ){
            int digit = num %10;
            sum += digit;
            product *= digit;
            num = num/10;
        }
        return product-sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
