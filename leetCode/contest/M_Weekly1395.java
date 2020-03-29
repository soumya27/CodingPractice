//Link:https://leetcode.com/problems/count-number-of-teams/
package leetCode.contest;


public class M_Weekly1395 {
    public static int numTeams(int[] rating) {
        int result =0 ;
        for (int i = 0 ; i < rating.length; i++){
            for ( int j = i+1; j < rating.length; j++){
                if ( rating[i]>rating[j]) {  // 3,2
                    for ( int k = j+1; k < rating.length; k++){
                        if ( rating[j]>rating[k]){
                            result++;
                        }
                    }
                }else if ( rating[i]< rating[j]) { // 2,3
                    for ( int k = j+1; k < rating.length; k++){
                        if ( rating[j]< rating[k]){
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numTeams(new int[]{1,2,3,4}));
    }
}
