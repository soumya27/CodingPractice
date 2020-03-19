//Link:https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
package leetCode.Easy;

public class E_Leetcode1342 {

//    public int numberOfSteps (int num) {
//        if (num == 0) return 0;
//        return (num % 2 == 0) ?
//                numberOfSteps(num / 2) + 1 :
//                numberOfSteps(num - 1) + 1;
//    }

    public int numberOfSteps (int num) {

        int result = 0;
        while ( num > 0 ){
            if (num%2 == 0 )
                num= num/2;
            else
                num = num -1;
            result++;
        }
        return result;
    }

}
