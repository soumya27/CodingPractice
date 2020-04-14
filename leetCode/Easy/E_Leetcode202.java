//Link:https://leetcode.com/problems/happy-number/
package leetCode.Easy;

public class E_Leetcode202 {


    public static boolean isHappy(int n) {
        int sum =0 ;
        while (sum != 1 && sum !=4){
            sum =0;
            while(n != 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            System.out.println(sum);
            n = sum;
        }
        return sum == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(9));
    }
}
