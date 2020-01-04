package InterviewPrep_HackerRank.Sorting;

public class InsertionSort {

    // Method 1 : me
//    private static void sort(int[] input){
//        System.out.println("Input to sort algorithm : ");
//        print(input);
//        for (int j = 1; j<input.length ; j++){
//            int key = j;
//            for (int i = j-1 ; i>=0 ; i--){
//                if(input[key]<input[i]){
//                    swap(input,key,i);
//                    key--;
//                }
//                else {
//                    break;
//                }
//            }
//        }
//        System.out.println("\nOutput of the sorting algorithm : ");
//        print(input);
//    }
//
//    private static void swap(int[] input, int key, int i){
//        int temp = input[key];
//        input[key]= input[i];
//        input[i]= temp;
//    }

//    method 2: according to book

    private static void sort(int[] input){
        System.out.println("Input to sort algorithm : ");
        print(input);
        for( int i =1 ; i<input.length; i++){
            int key = input[i];
            int j = i-1;
            while( j>=0 && input[j]> key){
                input[j+1] = input[j];
                j = j-1;
            }
            input[j+1]= key;
        }
        System.out.println("\nOutput of the sorting algorithm : ");
        print(input);
    }

    private static void print(int[] input){
        for (int value : input) {
            System.out.print(value + " ");
        }
    }
    public static void main(String[] args) {
        int[] input = new int[]{5,2,4,6,1,3};
        sort(input);
    }
}
