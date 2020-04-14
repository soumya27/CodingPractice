package leetCode.Easy;

public class E_Leetcode1399 {

    public static int countLargestGroup(int n) {
        int[] sums = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n ;i++){
            int sum = sumOfDigits(i);
            sums[sum] += 1;
            max = Math.max(sums[sum], max);
        }
        int count =0;
        for(int num : sums) {
           if (num == max)
               count++;
        }
        return count;
    }

    public static int sumOfDigits(int num ){
        int sum=0;
        while (num > 0 ){
           sum += num %10;
           num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countLargestGroup(24));
    }
}
