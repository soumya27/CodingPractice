//link: https://www.hackerrank.com/challenges/big-sorting/problem
package HackerRank_algorithms_Sorting;

public class E_BigSorting {

    static String[] bigSorting(String[] unsorted) {
        // doing an insertion sort
        for( int i =1; i<unsorted.length;i++) {
            long key = Long.parseLong(unsorted[i]);
            int j = i - 1;
            while (j >= 0 && Long.parseLong(unsorted[j]) > key) {
                unsorted[j + 1] = unsorted[j];
                j--;
            }
            unsorted[j + 1] = Long.toString(key);
        }
        return unsorted;
    }

    public static void main(String[] args) {
        String[] unsorted = new String[]{"10","2","20","3","0","12"};
        bigSorting(unsorted);
    }
}
