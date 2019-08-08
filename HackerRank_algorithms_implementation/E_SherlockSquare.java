//Link:https://www.hackerrank.com/challenges/sherlock-and-squares/problem
package HackerRank_algorithms_implementation;

public class E_SherlockSquare {

    static int squares(int a, int b) {
        double count=0;
        count = Math.floor( Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) +1;
        return (int)count;
    }

    public static void main(String[] args) {
        System.out.println(squares(3,9));
        System.out.println(squares(17,24));
    }
}
