//Link:https://www.hackerrank.com/challenges/birthday-cake-candles/problem
package HackerRank_algorithms_warmup;


import java.util.HashMap;

public class E_candleHeights {
    static int birthdayCakeCandles(int[] ar) {
        HashMap<Integer,Integer> values = new HashMap<>();
        int max = ar[0];
        for(int i =0 ; i< ar.length;i++){
                if(ar[i]>max)
                    max=ar[i];
                if(values.get(ar[i])==null)
                    values.put(ar[i],1);
                else
                    values.put(ar[i],values.get(ar[i])+1);
        }
        return values.get(max);
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,1,5,7,};
        System.out.println(birthdayCakeCandles(array));
    }
}
