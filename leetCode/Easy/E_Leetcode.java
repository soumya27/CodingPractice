package leetCode.Easy;

import java.util.HashMap;

public class E_Leetcode
{
    public static int countElements(int[] arr) {
        int count =0 ;
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int number : arr){
            frequency.merge(number,1,Integer::sum);
        }
        for ( int key : frequency.keySet()){
            if (frequency.get(key+1)!=null)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countElements(new int[]{1,1,3,3,5,5,7,7}));
    }
}
