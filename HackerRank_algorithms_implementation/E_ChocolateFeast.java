//https://www.hackerrank.com/challenges/chocolate-feast/problem
package HackerRank_algorithms_implementation;

public class E_ChocolateFeast {
    static int chocolateFeast(int n, int c, int m) {
        int result= n/c;
        int bought=1;
        int wrappers = result;
        while (bought != 0 ) {
            int rem = wrappers % m;
            bought = (wrappers - rem) / m;
            result += bought;
            wrappers = rem + bought;
        }
        return result ;
    }

    public static void main(String[] args) {
        System.out.println(chocolateFeast(10,2,5));
        System.out.println(chocolateFeast(12,4,4));
        System.out.println(chocolateFeast(6,2,2));
    }
}
