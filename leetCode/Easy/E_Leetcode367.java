package leetCode.Easy;

public class E_Leetcode367 {

    public static boolean isPerfectSquare(int num) {
        long left =1, right = num;
        while ( left <= right){
            long mid = (left + right) /2 ;
            if ( mid* mid == num)
                return true;
            else if (mid * mid < num){
                left = mid+1;
            }else {
                right = mid -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(645));
    }
}

