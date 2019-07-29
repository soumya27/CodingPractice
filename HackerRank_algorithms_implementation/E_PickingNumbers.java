//Link: https://www.hackerrank.com/challenges/picking-numbers/problem

package HackerRank_algorithms_implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class E_PickingNumbers {

//    Method - brute force O(n2)
    public static int pickingNumbers(List<Integer> a) {
        int max=0;
        int count=0;
        Collections.sort(a);
        for(int i =0 ;i<a.size()-1;i++){
            if(count>max)
                max= count;
            count=1;
            for(int j = i+1; j<a.size();j++){
                if(a.get(j)-a.get(i)<=1)
                    count++;
                else
                    break;
            }
        }
        return max;
    }

//    Method 2  : have a frequency array
//    find max of f[i] + f[i+1]

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
           1,1,2,2,2,3
        ));
        System.out.println(pickingNumbers(numbers));
    }
}
