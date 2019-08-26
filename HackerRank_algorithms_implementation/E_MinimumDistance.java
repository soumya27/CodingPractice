//https://www.hackerrank.com/challenges/minimum-distances/problem
package HackerRank_algorithms_implementation;

public class E_MinimumDistance {

    static int minimumDistances(int[] a) {
        int result=Integer.MAX_VALUE;
        int[] values = new int[100001];
        for( int i =0 ; i < a.length; i++){
            if(values[a[i]] == 0)
                values[a[i]] = -(i+1);
            else if(values[a[i]] < 0) {
                values[a[i]] = values[a[i]] + (i + 1);
                if(values[a[i]] < result)
                    result = values[a[i]];
            }
        }
        if(result == Integer.MAX_VALUE)
            result = -1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minimumDistances(new int[]{1,2,3,4,5,6,7}));
    }
}
