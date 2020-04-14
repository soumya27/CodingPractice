//https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3299/
package leetCode.Medium;

public class M_StringShift {
    public static String stringShift(String s, int[][] shift) {
        StringBuilder string = new StringBuilder(s);
        for (int[] row : shift){
            System.out.println(string.toString());
            if (row[0] == 0){ // shift left
                while(row[1]-- > 0 ) {
                    string.append(string.charAt(0));
                    string.deleteCharAt(0);
                }
            }else{ //shift right
                while(row[1]-- > 0 ) {
                    string.insert(0, string.charAt(string.length() - 1));
                    string.deleteCharAt(string.length() - 1);
                }
            }
        }
        return string.toString();
    }

    public static void main(String[] args) {
        int[][] shift = new int[][]{
                {1,1},
                {1,1},
                {0,2},
                {1,3}
        };

        System.out.println(stringShift("abcdefg",shift));
    }
}
