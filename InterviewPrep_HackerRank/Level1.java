package InterviewPrep_HackerRank;

import java.util.Arrays;

public class Level1 {

    public static boolean isPresent( int[] array, int low , int high ,int value ){
        if (high >= low){
            int mid = low +(high-low)/2;
            if (array[mid]== value)
                return true;
            else if (array[mid]> value)
                return isPresent(array,low,mid-1,value);
            else
                return isPresent(array,mid+1,high,value);
        }
        return false;
    }

    public static int solution(int[] x, int[] y) {
        if(x.length > y.length){
            Arrays.sort(y);
            for (int value : x){
                if (!isPresent(y,0,y.length -1,value))
                    return value;
            }
        }else{
            Arrays.sort(x);
            for (int value : y){
                if (!isPresent(x,0,x.length-1,value))
                    return value;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{14, 27, 1, 4, 2, 50, 3, 1}, new int[]{2, 4, -4, 3, 1, 1, 14, 27, 50}));
    }
}
