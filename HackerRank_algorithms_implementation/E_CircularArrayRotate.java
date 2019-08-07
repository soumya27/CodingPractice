//Link:https://www.hackerrank.com/challenges/circular-array-rotation/forum
package HackerRank_algorithms_implementation;

public class E_CircularArrayRotate {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int n = a.length;
        int temp[] = new int[n];
        if(k>n)
            k = k%n;
        for(int i = n-k, j =0 ; j<n;j++){
            temp[j] = a[i];
            if(i == n-1)
                i=0;
            else
                i++;

        }

        int result[] = new int[queries.length];
        for(int i = 0; i <queries.length ; i++){
            result[i]= temp[queries[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = new int[]{1,2,3};
        int q[] = new int[]{0,1,2};
        int result[] = circularArrayRotation(a,3,q);
        for (int i : result)
            System.out.println(i);
    }
}
