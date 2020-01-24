//Link:https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
package HackerRank_algorithms_implementation;

public class M_ClimbingLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];
        int n  =  scores.length;
        n = removeDuplicates(scores,n);
        for (int i = alice.length-1; i>= 0 ; i--){
            if( alice[i] >= scores[0])
                result[i]= 1;
            else if ( alice[i]< scores[n-1])
                result[i] = n+1;
            else
                result[i] = binarySearch(scores,0,n-1, alice[i]) +1;
        }
        return result;
    }

    private static int removeDuplicates(int[] arr, int n)
    {
        if (n == 0 || n == 1)
            return n;

        int j = 0;

        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[n-1];

        return j;
    }

    static int binarySearch(int[] arr, int l, int h, int key)
    {
        if (h >= l) {
            int mid = (l + h )/ 2;
            if( arr[mid]==key){
                return mid;
            }
            if(l == mid || h == mid){
                if(key <  arr[mid]  && key >  arr[h])
                    return  mid+1;
                else if (key < arr[mid]  && key <  arr[h])
                    return h +1;
                else if (key >  arr[mid]&& key > arr[l])
                    return l;
                else
                    return mid+1;
            }
            if ( arr[mid] < key )
                return binarySearch(arr, l, mid - 1, key);

            return binarySearch(arr, mid + 1, h, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] scores = new int[]{100,100,50,40,20,20,10};
        int[] alice = new int[]{5,25,50,120};

        int[] result = climbingLeaderboard(scores,alice);
        for (int output: result){
            System.out.print(output+ " ");
        }
    }
}
