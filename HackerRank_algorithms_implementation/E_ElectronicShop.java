//Link: https://www.hackerrank.com/challenges/electronics-shop/problem
package HackerRank_algorithms_implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class E_ElectronicShop {

// Method with o(N+M) Solution
    static int getMoneySpent(List<Integer> keyboards, List<Integer> drives, int b) {
        Collections.sort(keyboards,Collections.reverseOrder());
        Collections.sort(drives);
        int max =-1;
        for(int i=0,j=0; i<keyboards.size();i++){
            for(;j<drives.size();j++) {
                if (keyboards.get(i) + drives.get(j) > b) break;
                if (keyboards.get(i) + drives.get(j) > max)
                    max = keyboards.get(i) + drives.get(j);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        List<Integer> keyboard = new ArrayList<>(Arrays.asList(
           1,3
        ));
        List<Integer> drives = new ArrayList<>(Arrays.asList(
           2,8,5
        ));
        int b=10;
        System.out.println(getMoneySpent(keyboard,drives,b));
    }
}
