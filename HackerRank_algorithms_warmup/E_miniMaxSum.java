//link: https://www.hackerrank.com/challenges/mini-max-sum
package HackerRank_algorithms_warmup;

public class E_miniMaxSum {

    static void miniMaxSum(int[] array){
//        int[] prefixArray = new int[array.length];
        Long sum=new Long(0);
        Long max=Long.MIN_VALUE,min=Long.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            sum+= Long.valueOf(array[i]);
            if(Long.valueOf(array[i])>max)
            max = Long.valueOf(array[i]);
            if(Long.valueOf(array[i])<min)
            min =Long.valueOf(array[i]);
        }
        System.out.println((sum-max )+" "+(sum-min));

    }

    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,7,9};
        miniMaxSum(array);
    }
}
