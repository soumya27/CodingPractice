package InterviewPrep_HackerRank.Arrays;

public class fibno {

//    Method1
//    static int fib(int n){
//        if (n<=1)
//            return n;
//        return fib(n-1) +fib(n-2);
//    }

//    Method 2
    static int fib(int n){
        int a=0,b=1,c=0;
        if(n == 0)
            return 0 ;
        if(n ==1)
            return a;
//        if()

        for(int i =2 ; i<=n ;i++){
            c =a+b;
            b=c;
            a=b;
        }
        return c;
    }


    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
