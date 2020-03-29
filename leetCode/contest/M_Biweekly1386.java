//Link:https://leetcode.com/contest/biweekly-contest-22/problems/cinema-seat-allocation/
package leetCode.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class M_Biweekly1386 {
    public static int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        int count = 0 ;
        HashMap<Integer, ArrayList<Integer>> reservationMap = new HashMap<>();

        for(int[] seating : reservedSeats){
            if ( reservationMap.get(seating[0]) != null)
                reservationMap.get(seating[0]).add(seating[1]);
            else {
                ArrayList<Integer> col = new ArrayList<>();
                col.add(seating[1]);
                reservationMap.put(seating[0],col );
            }
        }

        for( Integer row : reservationMap.keySet()){
            boolean[] seats = new boolean[10];
            for ( Integer col : reservationMap.get(row)){
                seats[col-1] = true;
            }
            System.out.println(Arrays.toString(seats));
            if (!(seats[1] || seats[2] || seats[3] || seats[4])){
                count ++;
                seats[1]= seats[2] = seats[3] = seats[4] = true;
            }
            if (!(seats[5] || seats[6] || seats[7] || seats[8])) {
                count++;
                seats[5]= seats[6] = seats[7] = seats[8] = true;
            }
            if (!(seats[3] || seats[4] || seats[5] ||seats[6])) {
                count++;
                seats[5] = seats[6] = seats[3] = seats[4] = true;
            }
        }
        // empty rows
//        System.out.println(n - reservationMap.size());
        if( n - reservationMap.size() != 0 ){
             count += (n - reservationMap.size()) * 2;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfFamilies(2, new int[][]{
                {2,1},
                {1,8},{2,6}
        }));

    }
}
