//Link:https://leetcode.com/problems/count-primes/submissions/
package leetCode.Easy;

public class PrimeInRange {

    public int countPrimes(int n) {
        int count=0;
        int[] primeArray = new int[n+1]; // by default - it is 0(true) and 1 will be false

        for( int i= 2 ;i*i<=n;i++){
            if(primeArray[i]==0){
                for( int j = i*2 ; j<=n ;j+=i){
                    primeArray[j]=1;
                }
            }
        }
        for(int i = 2 ; i< n;i++){
            if(primeArray[i]==0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        PrimeInRange  primeInRange = new PrimeInRange();
        System.out.println(primeInRange.countPrimes(2));
    }
}
