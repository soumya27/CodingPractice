//Link:https://www.hackerrank.com/challenges/find-digits/problem
package HackerRank_algorithms_implementation;

public class E_FindDigit {

    static int findDigits(int n) {
        int count =0;
        int number = n;
        while(number>0){
            int digit = number%10;
            number = number /10;
            try {
                if (n % digit == 0)
                    count++;
            }
            catch (Exception e){
                //do nothing
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(12));
    }
}
