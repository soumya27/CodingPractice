//Link: https://www.hackerrank.com/challenges/migratory-birds/problem
package HackerRank_algorithms_implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class E_MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {
        int bird=0, counter=0 ,max=0;
        Collections.sort(arr,Collections.reverseOrder());
        for (int i =0 ; i<arr.size()-1;i++){
            if(arr.get(i)!=arr.get(i+1)){
                if(counter>=max){
                    max=counter;
                    bird=arr.get(i);
                }
                counter=0;
            }
            else
                counter++;
        }
        return bird;
    }

    public static void main(String[] args) {
        List<Integer> sigthings = new ArrayList<>(Arrays.asList(
        1,1,2,2,3
        ));
        System.out.println(migratoryBirds(sigthings));
    }
}
