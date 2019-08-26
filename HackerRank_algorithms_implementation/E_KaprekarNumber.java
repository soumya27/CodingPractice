//https://www.hackerrank.com/challenges/kaprekar-numbers/problem
package HackerRank_algorithms_implementation;

public class E_KaprekarNumber {

    static boolean isKaprekarNumber(long number){
        String square = String.valueOf(number*number);
        int len = square.length();
        if(len >1){
            long left = Long.parseLong(square.substring(0,len/2));
            long right = Long.parseLong(square.substring(len/2,len));
            return left+right == number;
        }
        else
            return Integer.parseInt(square) == number;
    }
    static void kaprekarNumbers(int p, int q) {
        boolean invalidRange = true;
        for(int i=p; i <=q ;i++){
            if(isKaprekarNumber((long)i)) {
                System.out.print(i + " ");
                invalidRange = false;
            }
        }
        if(invalidRange)
            System.out.println("INVALID RANGE");
    }

    public static void main(String[] args) {
        kaprekarNumbers(1,100);
//        System.out.println(isKaprekarNumber(55));
    }

}
