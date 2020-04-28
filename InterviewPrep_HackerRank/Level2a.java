package InterviewPrep_HackerRank;

import java.util.Arrays;

public class Level2a {

    static int N =3;
    public static int solution(int[] l) {

        sortArray(l); // sort the array in reverse order
        StringBuilder result = new StringBuilder();
        int sum = getSum(l, result);
        int remainder = sum % N;

        //if remainder is 1 - find a number whose remainder is 1
        // or two whose remainders are 2
        if (remainder == 1 ){
            for (int i = l.length-1; i >=0; i--){
                if( l[i] % N == remainder){
                    result.deleteCharAt(i);
                    return Integer.parseInt(result.toString());
                }
            }
            if (findTwoNumbers(l, result, 2))
                return Integer.parseInt(result.toString());
        }
        //if remainder is 2 - find a number whose remainder is 2
        // or two whose remainders are 1
        else if (remainder == 2){
            for (int i = l.length-1; i >=0; i--){
                if( l[i] % N == 2){
                    result.deleteCharAt(i);
                    return Integer.parseInt(result.toString());
                }
            }
            if (findTwoNumbers(l, result, 1))
                return Integer.parseInt(result.toString());
        }
        else {
            return Integer.parseInt(result.toString());
        }
        return 0;
    }

    private static boolean findTwoNumbers(int[] l, StringBuilder result, int remainder) {
        int count = 2;
        for (int i = l.length - 1; i >= 0; i--) {
            if (l[i] % N == remainder && count > 0) {
                result.deleteCharAt(i);
                count--;
            }
        }
        return count == 0 && result.length() != 0;
    }

    private static int getSum(int[] l, StringBuilder result) {
        int sum = 0;
        for (int value : l){
            sum += value;
            result.append(value);
        }
        return sum;
    }

    private static void sortArray(int[] l) {
        for(int i=0;i<l.length;i++)
            l[i]=-l[i];
        Arrays.sort(l);
        for(int i=0;i<l.length;i++)
            l[i]=-l[i];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 4, 1}));
        System.out.println(solution(new int[]{3, 1, 4, 1, 5, 9}));
        System.out.println(solution(new int[]{3,1,1,9}));
        System.out.println(solution((new int[]{ 0,0,0})));
        System.out.println(solution(new int[]{3}));
    }
}
