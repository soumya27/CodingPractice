package InterviewPrep_HackerRank;
import java.util.*;
import java.util.stream.Collectors;

public class H_FundraisingProblem {
    public static ArrayList<TableDetails> guestTableMap = new ArrayList<>();
    public static TreeMap<Integer, Integer> topCharmerMap = new TreeMap<>();
    public static  List<List<Integer>> guestGrid = new ArrayList<>();

    public static class TableDetails implements Comparable<TableDetails>{
        Integer generosity;
        int number;
        TableDetails (int generosity, int number){
            this.generosity = generosity;
            this.number = number;
        }

        @Override
        public String toString() {
            return "{ generosity=" + generosity +
                    ", number=" + number +
                    '}';
        }

        @Override
        public int compareTo(TableDetails o) {
            return this.generosity.compareTo(o.generosity);
        }
    }
    static void guestTable(int[] generosities, int index) {
        guestGrid.add(Arrays.stream(generosities).boxed().collect(Collectors.toCollection(ArrayList::new)));
        for (int values : generosities) {
            guestTableMap.add(new TableDetails(values,index));
        }
    }

    static void topCharmer(int[][] charms){
        for( int i = 0 ; i < charms.length; i++){
            int max = Integer.MIN_VALUE;
            for (int j = 0 ; j <charms[0].length; j++){
                max = Math.max(max, charms[i][j]);
            }
            topCharmerMap.put(max,i+1);
        }
    }
    static void solve(ArrayList<TableDetails> DGuestTable ,NavigableMap<Integer, Integer> DCharmerTable,int[][] charms, int k ) {
        int charity = 0 ;
        HashMap<Integer,Integer> TableGroupMap = new HashMap<>();
        while (!DGuestTable.isEmpty() && !DCharmerTable.isEmpty()){
            int row = DCharmerTable.get(DCharmerTable.firstKey())-1;
            ArrayList<Integer> rowList = new ArrayList<>();
            for (int value : charms[row]){
                rowList.add(value);
            }
            rowList.sort(Collections.reverseOrder());
            for(int value : rowList) {
                for (int i = 0; i < k; i++) {
//                    for (va)
                        System.out.println(value +" "+DGuestTable.get(0).generosity);
                        charity += value * DGuestTable.get(0).generosity;
                        DGuestTable.remove(0);
                    }
                }

            DCharmerTable.remove(DCharmerTable.firstKey());
        }
        System.out.println(charity);
    }

    public static void main(String[] args) {
        int[][] charms = new int[][]{
                {9,1,1},
                {8,1,1},
                {7,1,1}
        };

        // before this you want to check if length of array is less then n
        // if not return -1
//        guestTable(new int[]{10,20,30});
//        guestTable(new int[]{40,50,60});
//        guestTable(new int[]{70,80,90});

        guestTable(new int[]{1000,10},1);
        guestTable(new int[]{1000,500,1000},2);
        guestTable(new int[]{100,10},3);

        guestTableMap.sort(Collections.reverseOrder());
        System.out.println(guestTableMap);

        topCharmer(charms);

        NavigableMap<Integer, Integer> DCharmerTable = topCharmerMap.descendingMap();
        System.out.println(DCharmerTable.toString());

        int k = 1;
        solve(guestTableMap,DCharmerTable,charms,k);
    }
}
