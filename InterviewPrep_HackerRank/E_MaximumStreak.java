//Link:https://www.hackerrank.com/contests/hack-the-interview-u-s-2/challenges/heads-or-tails
package InterviewPrep_HackerRank;

import java.util.ArrayList;
import java.util.List;

public class E_MaximumStreak {
    public static List<Integer> getMaxStreaks(List<String> toss) {
        int maxHead = Integer.MIN_VALUE, maxTails = Integer.MIN_VALUE,
                headCount=0, tailCount=0;
        List<Integer> result = new ArrayList<>();
        for( int i = 0 ; i < toss.size(); i++) {
            String input = toss.get(i);
            if (input.equals("Heads")) {
                headCount = 0;
                int k= i;
                while ( k < toss.size() && toss.get(k).equals("Heads")) {
                    ++headCount; ++k;
                }
                maxHead = Math.max(maxHead, headCount);
            }else {
                tailCount = 0;
                int k= i;
                while ( k < toss.size() && toss.get(k).equals("Tails")) {
                    ++tailCount; ++k;
                }
                maxTails = Math.max(maxTails, tailCount);
            }
        }
        maxHead = Math.max(maxHead, headCount);
        maxTails = Math.max(maxTails, tailCount);
        result.add(maxHead);
        result.add(maxTails);
        return result;
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("Tails");
        input.add("Tails");
        input.add("Heads");
        input.add("Heads");
        input.add("Heads");
        input.add("Tails");

        for(int value : getMaxStreaks(input)){
            System.out.println(value);
        }
    }
}
