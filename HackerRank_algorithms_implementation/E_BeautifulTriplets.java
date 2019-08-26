//https://www.hackerrank.com/challenges/beautiful-triplets/problem
package HackerRank_algorithms_implementation;

public class E_BeautifulTriplets {

//    Method 1 : brute force
//    O(10pow12)
//        static int beautifulTriplets(int d, int[] arr) {
//            int count =0 ;
//            for(int i=0; i<arr.length; i++){
//                for( int j = i+1; j< arr.length; j++){
//                   if( (arr[j]- arr[i]) == d){
//                       for(int k= j+1;k<arr.length;k++){
//                           if((arr[k]- arr[j]) == d)
//                               count++;
//                       }
//                   }
//                }
//            }
//            return count;
//        }

//    Method 2: Array to count element
//    O(10pow4)
    static int beautifulTriplets(int d,int[] arr){
        int count=0, size = arr.length;
        int[] presentElements = new int[20002];
        for(int i=0; i<size; i++){
            if(presentElements[arr[i]]==0)
                presentElements[arr[i]]++;
        }
        for(int i=0; i<size; i++){
            int j =arr[i]+d, k = j+d;
            if( j <20002 && k <20002){
                if(presentElements[j]!=0){
                    if(presentElements[k] !=0)
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3,new int[]{1, 2, 4, 5, 7, 8, 10}));
    }
}
