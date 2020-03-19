//Link:https://leetcode.com/problems/reveal-cards-in-increasing-order/
package leetCode.Medium;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class M_Leetcode950 {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int[] result = new int[deck.length];
        Arrays.sort(deck);

        Deque<Integer> index = new LinkedList<>();
        for (int i = 0 ; i< deck.length; i++){
            index.add(i);
        }
        for (int card : deck){
            result[index.pollFirst()] = card;
            if (!index.isEmpty()){
                index.add(index.pollFirst());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deckRevealedIncreasing(new int[]{10,9,1,2,8,7})));
    }
}
