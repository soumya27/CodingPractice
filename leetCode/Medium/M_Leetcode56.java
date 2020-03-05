//Link:https://leetcode.com/problems/merge-intervals/
package leetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class M_Leetcode56 {
    List<List<Integer>> result  = new ArrayList<>();
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0)
            return null;
        sortByStart(intervals);
        for( int[] row : intervals){
            System.out.println(Arrays.toString(row));
        }
        List<Integer> firstInterval = new ArrayList<>();
        firstInterval.add(intervals[0][0]);
        firstInterval.add(intervals[0][1]);
        result.add(firstInterval);
        for(int i = 1; i<intervals.length; i++){
            if(isOverlap(result.get(result.size()-1).get(1),intervals[i][0])){
                if(result.get(result.size()-1).get(1)<intervals[i][1])
                    mergeIntervals(result.get(result.size()-1).get(0),intervals[i][1]);
            }else {
                List<Integer> interval = new ArrayList<>();
                interval.add(intervals[i][0]);
                interval.add(intervals[i][1]);
                result.add(interval);
            }
        }
        return result.stream().map(  u  ->  u.stream().mapToInt(i->i).toArray()  ).toArray(int[][]::new);
    }

    private void sortByStart (int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
    }

    private void mergeIntervals(int i, int j){
       List<Integer> interval = new ArrayList<>();
       interval.add(i);
       interval.add(j);
       result.remove(result.size()-1);
       result.add(interval);
    }

    private boolean isOverlap(int end, int nextStart){
        return end >= nextStart;
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{};
        int[][] result = new M_Leetcode56().merge(intervals);
        for( int[] row : result){
            System.out.println(Arrays.toString(row));
        }
    }
}
