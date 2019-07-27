//Link:https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

package HackerRank_algorithms_implementation;

public class E_BreakingRecords {

    static int[] breakingRecords(int[] scores) {
        int max,min;
        int[] changeCount = new int[2];
        max = min = scores[0];
        for(int i =1;i<scores.length;i++){
            if(scores[i]>max){
                max =scores[i];
                changeCount[0]++;
            }
            if(scores[i]<min){
                min =scores[i];
                changeCount[1]++;
            }
        }
        return changeCount;
    }

    public static void main(String[] args) {
        int[] scores = new int[]{10,5,20,20,4,5,2,25,1};
        int[] breakingRecords = breakingRecords(scores);
        System.out.println(breakingRecords[0]+" "+breakingRecords[1]);
    }

}
