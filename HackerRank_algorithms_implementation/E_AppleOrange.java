//Link: https://www.hackerrank.com/challenges/apple-and-orange/problem
package HackerRank_algorithms_implementation;

public class E_AppleOrange {

    public static int counter(int[] values,int start,int rangeStart, int rangeEnd){
        int count=0;
        int value=0;
        for(int i =0;i<values.length;i++){
            value = start+values[i];
            if(value>=rangeStart &&value<=rangeEnd)
                count++;
        }
        return count;
    }

    public static void countApplesAndOranges(int s,int t,int a,int b ,int[] apples,int[] oranges){
        int appleCount=0,orangeCount=0;
        appleCount= counter(apples,a,s,t);
        orangeCount =counter(oranges,b,s,t);
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        int s =7, t=11 ,a =5, b=15, m=3,n=2;
        int[] apples = new int[]{-2,2,1};
        int[] oranges = new int[]{5,-6};
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
}
