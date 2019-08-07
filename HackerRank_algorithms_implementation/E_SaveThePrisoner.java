//link:https://www.hackerrank.com/challenges/save-the-prisoner/problem
package HackerRank_algorithms_implementation;
import java.io.*;

public class E_SaveThePrisoner {

    static int saveThePrisoner(int people, int candy, int start) {
        int findPrisoner =0;
        int remainder = candy % people;
        findPrisoner = (start +remainder -1)%people;
        if(findPrisoner == 0)
            return people;
        return findPrisoner;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(saveThePrisoner(208526924,756265725,150817879));
    }
}
