//link:https://www.hackerrank.com/challenges/sparse-arrays/problem
package HR_DataStructures.Arrays;

import java.util.HashMap;
import java.util.Map;

public class M_sparseArray {

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];
        Map<String ,Integer> stringsMap = new HashMap<>();
        // Instead of this step - we can create map while taking the input
        for (String value : strings){ // O(n)
            stringsMap.merge(value, 1, Integer::sum); // O(n)
        }
        int i=0;
        for (String value : queries){ // O(n)
            result[i++] = stringsMap.get(value) == null ? 0 :  stringsMap.get(value);  // O(1)
        }
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
