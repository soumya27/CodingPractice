//Link:https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package leetCode.Easy;

public class E_Leetcode1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0 ; i <nums.length; i++){
            int count =0;
            for ( int j = 0 ; j < nums.length;j++){
                if( i != j){
                    if( nums[j]<nums[i]){
                        count++;
                    }
                }
            }
            result[i] = count;
        }
//        List<Integer> sortedInput = IntStream.of(nums)
//                .boxed().collect(Collectors.toCollection(ArrayList::new));
//        Collections.sort(sortedInput);
//        for (int i = 0 ; i <nums.length; i++){
//            int value = sortedInput.indexOf(nums[i]);
//            nums[i]= value;
//        }

        return result;
    }
    public static void main(String[] args) {
//        int[] input = new int[]{8,1,2,2,3};
        int[] input = new int[] {6,5,4,8};
//        smallerNumbersThanCurrent(input);
        for (int value: smallerNumbersThanCurrent(input)){
            System.out.println(value);
        }
    }
}
