//Link: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
package HackerRank_algorithms_implementation;

public class E_BeautifulDays {
    static int beautifulDays(int i, int j, int k) {
        int count=0;
        for(int start= i;start<=j;start++){
            if(Math.abs(start-reverseNumber(start))%k ==0)
                count++;
        }
        return count;
    }

    static int reverseNumber(int number){
        int reversed=0;
        while(number!=0){
            int digit = number%10;
            reversed = reversed*10+digit;
            number /=10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20,23,6));
    }
}
