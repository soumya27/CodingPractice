//https://www.hackerrank.com/challenges/lisa-workbook/problem
package HackerRank_algorithms_implementation;

public class E_LisaWorkbook {
    static int workbook(int n, int k, int[] arr) {
        int result =0,counter =0, index = 1;
        for(int i = 0; i < arr.length; i++){
           for(int j = 1 ; j<=arr[i]; j++){
               if (index == j)
                   result++;
               counter++;
               if(counter ==k) {
                   index++;
                   counter=0;
               }
            }
            if(counter!=0){
                index++;
                counter=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(workbook(100,10,
//                new int[]{
//                        10,10,10,10,10,10,10,10,10,10,
//                        10,10,10,10,10,10,10,10,10,10,
//                        10,10,10,10,10,10,10,10,10,10,
//                        10,10,10,10,10,10,10,10,10,10,
//                        10,10,10,10,10,10,10,10,10,10,
//                        10,10,10,10,10,10,10,10,10,10,
//                        10,10,10,10,10,10,10,10,10,10,
//                        10,10,10,10,10,10,10,10,10,10,
//                        10,10,10,10,10,10,10,10,10,10,
//                        10,10,10,10,10,10,10,10,10,10}));
//
//        System.out.println(workbook(1,5,new int[]{8}));
//        System.out.println(workbook(5,3,new int[]{4,2,6,1,10}));
        System.out.println(workbook(10,1,new int[]{5,3,2,1,3,2,5,9,8,6}));
    }
}
