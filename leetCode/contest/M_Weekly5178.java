package leetCode.contest;

public class M_Weekly5178 {
    public static int sumFourDivisors(int[] nums) {
        int value = 0 ;
        for ( int num : nums){
           value += findNumOfDivisors(num);
        }
        return value;
    }
    public static int findNumOfDivisors(int num){
        int count =0;
        int sum = 0;
        for (int i=1; i<=Math.sqrt(num); i++)
        {
            if (num%i==0)
            {
                if (num/i == i) {
                    count++;
                    sum += i;
                } else {
                    count +=2;
                    sum += i;
                    sum+= num/i;
                }
            }
        }

        return count== 4? sum: 0 ;
    }

    public static void main(String[] args) {
        System.out.println(sumFourDivisors(new int[]{21,4,7}));
    }
}
