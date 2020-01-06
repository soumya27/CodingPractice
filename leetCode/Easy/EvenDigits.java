package leetCode.Easy;

public class EvenDigits {
    private static int findNumbers(int[] nums) {
        int result =0;
        for (int value:nums) {
            int n=value;
            int count = 0;
            while(n>0){
                n = n/10;
                count++;
            }
            if(count%2==0){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]  {555,901,482,1771};
//                {12,345,2,6,7896};
        System.out.println(findNumbers(array));
    }
}
