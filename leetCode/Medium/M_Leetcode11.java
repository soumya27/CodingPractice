//Link:https://leetcode.com/problems/container-with-most-water/
package leetCode.Medium;

public class M_Leetcode11 {
    public int maxArea(int[] height) {
        int area,max = Integer.MIN_VALUE, start =0, end = height.length-1;
        if(height.length == 0)
            return 0;
        while(end>start){
            area = (end - start) * Math.min(height[end],height[start]);
            if(area>max)
                max = area;
            if(height[start]<=height[end])
                start++;
            else
                end--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(new M_Leetcode11().maxArea(input));
    }
}
