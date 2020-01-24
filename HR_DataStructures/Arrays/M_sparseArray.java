//link:https://www.hackerrank.com/challenges/sparse-arrays/problem
package HR_DataStructures.Arrays;

import java.util.HashMap;
import java.util.Map;

public class M_sparseArray {

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];
         // create dict of strings
        Map<String ,Integer> stringsMap = new HashMap<>();
        for (String value : strings){
            // no key then
            stringsMap.merge(value, 1, Integer::sum);
        }
        int i=0;
        for (String value : queries){
            result[i++] = stringsMap.get(value) == null ? 0 :  stringsMap.get(value);
        }
        // look up query in dict
        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"ab","ab","abc"};
        String[] queries = {"ab","abc","bc"};
        int[] result = matchingStrings(strings,queries);
        for (int value: result){
            System.out.println(value);
        }
    }
}
