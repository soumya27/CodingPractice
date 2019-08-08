//Link: https://www.hackerrank.com/challenges/strange-code/problem
package HackerRank_algorithms_implementation;

public class E_StrangeCode {

    static long strangeCounter(long t) {
        long value =0 ;
        boolean found= false;
        long start =3, count=1, next = 2* start, startTime =1, endTime =3 ;
        while(!found){
            if( startTime <= t && endTime >= t)
                found = true;
            else {
                startTime = startTime + start;
                start = next;
                next = 2 * start;
                endTime = endTime + start;
                count++;
            }
        }
        value = start - (t - startTime);
        System.out.println("cycle : " +count);
        System.out.println("start : "+ start);
        System.out.println("next : " + next);
        System.out.println("start time : "+ startTime);
        System.out.println("End time : "+ endTime);
        return  value;
    }

    public static void main(String[] args) {
        System.out.println("Counter value : "+ strangeCounter(4));
    }
}
