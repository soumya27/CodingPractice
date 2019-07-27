package HackerRank_algorithms_implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E_BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {
        int size = s.size();
        int result =0;
        int count,sum=0;
        for(int i=0 ; i<=size-m;i++){
            count=i;
            for(int j=0; j<m;j++){
                sum+=s.get(count);
                count++;
            }
            if(sum==d)
                result++;
            sum=0;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> chocolate = new ArrayList<>(Arrays.asList(
           2,2,1,3,2
        ));
        int d =4, m=2;
        System.out.println(birthday(chocolate,d,m));
    }
}
