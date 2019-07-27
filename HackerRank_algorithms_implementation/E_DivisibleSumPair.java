//Link: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
package HackerRank_algorithms_implementation;

public class E_DivisibleSumPair {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count=0;
        for (int i =0 ; i <(n-1); i++){
            for (int j=i+1;j<n;j++){
                if(i<j && (ar[i]+ar[j])%k == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,3,2,6,1,2};
        int n=6,k=3;
        System.out.println(divisibleSumPairs(n,k,array));

    }

}
