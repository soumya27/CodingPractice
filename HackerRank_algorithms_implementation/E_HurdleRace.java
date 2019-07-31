//Link:https://www.hackerrank.com/challenges/the-hurdle-race/problem
package HackerRank_algorithms_implementation;

public class E_HurdleRace {

    static int hurdleRace(int k, int[] height) {
        int portion=0;
        int max=-1;
        for(int i=0;i<height.length;i++){
            if(height[i]>max)
                max= height[i];
        }
        if(max>k)
            portion= max-k;
        return portion;
    }
    public static void main(String[] args) {
        int k =7;
        int[] heights = new int[]{2,5,4,5,2};
        System.out.println(hurdleRace(k,heights));
    }
}
