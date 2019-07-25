//Link:https://www.hackerrank.com/challenges/staircase/problem
package HackerRank_algorithms_warmup;

public class E_staircase {

    public static void staircase(int n){
        int c =n-1;
        for(int i =0 ;i < n ; i++){
            for(int j=0;j<n;j++){
                if(j>=c)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            c--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =6;
        staircase(n);
    }
}
