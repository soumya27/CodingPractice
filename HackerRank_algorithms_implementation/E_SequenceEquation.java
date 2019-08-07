//link: https://www.hackerrank.com/challenges/permutation-equation/problem
package HackerRank_algorithms_implementation;

import java.util.Arrays;

public class E_SequenceEquation {

    static int[] permutationEquation(int[] p) {
        int size = p.length;
        int[] y = new int[size];
        int[] a = new int[size];
        for( int i=0;i<size;i++)
            a[p[i]-1]=i;
        for( int i =0; i<size;i++)
            y[i]=a[a[i]]+1;
        System.out.println(Arrays.toString(a));
        return y;
    }

    public static void main(String[] args) {
        int[] p = new int[]{5,2,1,3,4};
        System.out.println(Arrays.toString(permutationEquation(p)));
    }
}
