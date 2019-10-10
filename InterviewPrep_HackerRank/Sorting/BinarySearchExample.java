package InterviewPrep_HackerRank.Sorting;

public class BinarySearchExample {

    private static boolean binarySearchRecurvise(int[] array, int x, int left, int right){
        if( left > right){
            return false;
        }
        // to avoid overflow in java
        int mid = left +((right-left)/2);
        if(array[mid]==x){
            return true;
        } else if(x < array[mid]){
            return binarySearchRecurvise(array, x,left,mid-1);
        } else {
            return binarySearchRecurvise(array,x,mid+1,right);
        }
    }

    private static boolean binarySearchRecurvise(int[] array, int x){
        return binarySearchRecurvise(array,x,0,array.length-1);
    }

    public static void main(String[] args) {
        int[] sortArray = new int[]{
                1,3,4,7,8,10,12,23,49,50,82,90
        };
        System.out.println(binarySearchRecurvise(sortArray,2));
    }

}
