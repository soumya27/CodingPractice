//Link: https://www.hackerrank.com/challenges/utopian-tree/problem
package HackerRank_algorithms_implementation;

public class E_UtopianTree {
    static int utopianTree(int n) {
        int growth=1;
        for(int i=1;i<=n;i++){
            if(i%2==0)
                growth++;
            else
                growth*=2;
        }
        return growth;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(1));
    }
}
