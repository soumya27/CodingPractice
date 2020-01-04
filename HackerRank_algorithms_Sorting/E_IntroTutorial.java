//link:https://www.hackerrank.com/challenges/tutorial-intro/problem
package HackerRank_algorithms_Sorting;

public class E_IntroTutorial {

    static int introTutorial(int V, int[] arr) {
        // find V in arr (sorted array)
        for(int i =0 ; i < arr.length; i++){
            if(V == arr[i])
                return i;
            if (arr[i] > V)
                break;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,6,10,12};
        System.out.println(introTutorial(6,arr));
    }
}
