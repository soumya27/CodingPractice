package leetCode.contest;

import java.util.ArrayList;
import java.util.List;

public class E_weekly9th {

    public static List<String> buildArray(int[] target, int n) {
        int length = target.length;
        List<String> result = new ArrayList<>();
        int counter =0;
        for (int i = 1; i <=n ;i++){
            if(target[counter] != i){
                result.add("Push");
                result.add("Pop");
            }else {
                result.add("Push");
                counter++;
                if (counter >= length)
                    return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] target = new int[]{1,2};
        int n = 4;
        for(String value : buildArray(target,n)){
            System.out.println(value);
        }
    }
}
