//https://www.hackerrank.com/challenges/weighted-uniform-string/problem
package HackerRank_algorithms_String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E_WeightedUniformString {
    static String[] weightedUniformStrings(String s, int[] queries) {
        String[] result = new String[queries.length];
        Set<Integer> intSet = new HashSet<Integer>();
        char previous = s.charAt(0);
        int count=1;
        intSet.add(count*((int)s.charAt(0)-96));
        for(int i=1; i<s.length();i++){
           if ( previous == s.charAt(i))
               count++;
           else
               count =1;
           int value = (int)s.charAt(i)-96;
           intSet.add(value*count);
           previous = s.charAt(i);
        }
        for(int i=0; i<queries.length;i++){
            if(intSet.contains(queries[i])){
                result[i]="Yes";
            }
            else
                result[i]="No";
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "ccaac";
//        String s ="zzzzzzzzyyyyt";
        int[] q = new int[]{3,6,1,2,9};
        System.out.println(Arrays.toString(weightedUniformStrings(s,q)));
    }
}
