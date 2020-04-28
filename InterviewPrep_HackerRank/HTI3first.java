package InterviewPrep_HackerRank;

import java.util.ArrayList;
import java.util.List;

public class HTI3first {

    public static int maxScore(List<Integer> a, int m) {
        List<Integer> subList = a.subList(0,m);
        int sum = 0;
        for (int value : subList){
            sum += value;
        }
        System.out.println(sum);
        return 0;
    }


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
//        1 5 4 2 3
        a.add(1);
        a.add(5);
        a.add(4);
        a.add(2);
        a.add(3);
        System.out.println(maxScore(a,2));

    }
}
