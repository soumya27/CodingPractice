package leetCode.Easy;

public class ReverseInteger {
    public static int reverseInteger(int number){
        int rev = 0;
        while (number != 0) {
            int pop = number % 10;
            number /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(-2147483648));
    }
}
