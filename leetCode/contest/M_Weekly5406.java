package leetCode.contest;

import java.util.ArrayList;
import java.util.List;

public class M_Weekly5406 {

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<Integer> appleIndex = new ArrayList<>();
        for (int i = 0; i < hasApple.size(); i ++){
            if (hasApple.get(i))
                appleIndex.add(i);
        }

//        find min path from 0 - all apple index
//        min btw path frm target or neighbour
        return 0;
    }
}
