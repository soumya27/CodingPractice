//Link : https://leetcode.com/problems/find-the-town-judge/
package leetCode.Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class E_Leetcode997 {

    static final int OUT =1;
    static final int IN = 0;
    static final int GIVER = 0;
    static final int TAKER = 1;

    public static int findJudge(int N, int[][] trust) {
        HashMap<Integer, ArrayList<Integer>> trusttable = new HashMap<>();
        for (int i =1 ; i <=N; i++){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0); // IN
            list.add(0); // OUT
            trusttable.put(i, list);
        }
        for (int[] singleTrust : trust){
            //giver
            ArrayList<Integer> list = trusttable.get(singleTrust[GIVER]);
            int outvote = list.get(OUT);
            list.set(OUT,outvote+1);
            trusttable.put(singleTrust[GIVER],list);
            // taker
            ArrayList< Integer> taker = trusttable.get(singleTrust[TAKER]);
            int invote = taker.get(IN);
            taker.set(IN,invote+1);
            trusttable.put(singleTrust[TAKER],taker);
        }

        for (int key : trusttable.keySet()){
//            System.out.println(key+" , "+trusttable.get(key).get(0)+" - " + trusttable.get(key).get(1));
            if (trusttable.get(key).get(OUT)==0 && trusttable.get(key).get(IN)==(N-1)){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 4;
        int[][] trust = new int[][]{
                {1,3}, {1,4}, {2,3},{2,4},{4,3}
        };
        System.out.println(findJudge(N,trust));
    }
}
