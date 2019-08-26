package HackerRank_algorithms_implementation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class E_ManasaAndStone {

    static int[] stones(int n, int a, int b) {
        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(0);
        for(int i = 1; i < n; i++){
            Set<Integer> bufferSet= new HashSet<Integer>();
            Iterator iterator = mySet.iterator();
            while(iterator.hasNext()){
                Integer element = (Integer) iterator.next();
                bufferSet.add(element+a);
                bufferSet.add(element+b);
            }
            mySet = bufferSet;
//            mySet.clear();
//            mySet.addAll(bufferSet);
        }
        TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
        myTreeSet.addAll(mySet);
        int[] result = myTreeSet.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public static void main(String[] args) {
        stones(3,1,2);
        stones(4,10,100);
    }

}
