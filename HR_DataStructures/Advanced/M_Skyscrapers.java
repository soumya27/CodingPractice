//Link:https://www.hackerrank.com/challenges/jim-and-the-skyscrapers/problem
package HR_DataStructures.Advanced;

import java.util.Stack;

public class M_Skyscrapers {

    public static long getRoutes_complexity_On( int[] skyScrappers ) {
        long routesCount = 0;
        Stack<Integer> stack = new Stack<>();

        for (int s : skyScrappers) {
            if (stack.isEmpty()) {
                stack.add(s);
            } else if (stack.peek() > s) {
                stack.add(s);
            } else if (stack.peek() < s) {
                while (!stack.isEmpty() && stack.peek() < s) {
                    long sameS, cnt = 0;
                    do {
                        sameS = stack.pop();
                        cnt++;
                    } while (!stack.isEmpty() && stack.peek() == sameS);
                    if (cnt >= 2) {
                        routesCount += ((cnt - 1) * cnt);
                    }
                }
                stack.add(s);
            } else if (stack.peek() == s) {
                stack.add(s);
            }
        }

        if( !stack.isEmpty() ) {
            long cnt = 1;
            boolean same;
            int s1 = stack.pop();
            while( !stack.isEmpty() ) {
                same = (s1 == stack.peek());
                if( same ) {
                    stack.pop();
                    cnt++;
                    if( stack.isEmpty() ) {
                        if( cnt > 1 ) {
                            routesCount += ((cnt-1)*cnt);
                        }
                    }
                }
                else {
                    if( cnt > 1 ) {
                        routesCount += ((cnt-1)*cnt);
                    }
                    cnt = 1;
                    s1 = stack.pop();
                }
            }
        }
        return routesCount;
    }

    public static void main(String[] args) {
        int[] skyScrappers = new int[]{3,2,1,2,3,3};
//        int[] skyScrappers = new int[]{1,1000,1};
        System.out.println(getRoutes_complexity_On(skyScrappers));
    }

}
