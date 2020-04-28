package InterviewPrep_HackerRank;

public class slevel3 {

//    public static int findLower2(int x){
//        return (int)Math.pow(2, (int)(Math.log(x) / Math.log(2)));
//    }
//
//    public static int findHigher2(int a){
//        return a!=Integer.highestOneBit(a)?2*Integer.highestOneBit(a):a;
//    }
//
//    public static int makeItOne(int n){
//       return (int) (Math.log(n)/Math.log(2));
//    }
//
//    public static int solution(int x){
//        int ceil = findHigher2(x);
//        int floor = findLower2(x);
//        ceil -= x;
//        floor = x- floor;
//        int count = Math.min(ceil,floor);
//        if (ceil<floor){
//            x = x +count;
//        }else{
//            x = x-count;
//        }
//        count += makeItOne(x);
//        return count;
//    }


    public static int solution (String x) {

        int numOfOps=0;

        int n = Integer.parseInt(x);

        numOfOps = counter (n, numOfOps);

        return numOfOps;

    }

    public static int counter (int n, int numOfOps) {

        double k = Math.log(n) / Math.log(2); //power of 2

        //Case 1: Check if n is an integer power of 2
        if (k == (int) k) {
            numOfOps += (int) k;
//			System.out.println("Integer power of 2 reached with n= " + n +" and k= " +k); //for tracking purposes for debugging only
            return numOfOps;
        }

        //Case 2: n is not an integer power of 2
        else {
            if (n > 3 * Math.pow(2, (int) k) / 2 ) { //error possible here due to the decimal number
                //Case 2a: n is one integer less than the nearest integer power of 2
                if (n - Math.pow(2, (int) (k + 1)) == -1) {
                    numOfOps += (int) k + 2;
//					System.out.println("One integer less than integer power of 2 reached with n= " + n + " and k=" + k); //for tracking purposes for debugging only
                    return numOfOps;
                }
                //Case 2b: n is some integers less than the nearest integer power of 2
                else {
                    //Case 2b(i): Even number
                    if (n % 2 == 0) {
                        numOfOps += 1;
//						System.out.println("n = " + n + " Case 2b(i) even number");
                        numOfOps = counter(n / 2, numOfOps);
//						System.out.println("Precheck numOfOps=" + numOfOps);
                        return numOfOps;
                    }
                    //Case 2b(ii): Odd number
                    else {
                        numOfOps += 1;
//						System.out.println("n = " + n + " Case 2b(ii) odd number");

                        numOfOps = Math.min(counter(n + 1, numOfOps), counter(n - 1, numOfOps));
//						numOfOps = counter (n-1, numOfOps);

                        return numOfOps;
                    }
                }
            } else {
                //Case 3a: n is one integer greater than the nearest integer power of 2
                if (n - Math.pow(2, (int) (k))  == 1) {
                    numOfOps += (int) k + 1;
//					System.out.println("One integer greater than integer power of 2 reached with n= " + n +" and k= " +k); //for tracking purposes for debugging only
                    return numOfOps;
                }
                //Case 3b: n is some integers greater than the nearest integer power of 2
                else {
                    //Case 3b(i): Even number
                    if(n%2 == 0) {
                        numOfOps += 1;
//						System.out.println("n = " + n + " Case 3b(i) even number");
                        numOfOps = counter (n/2, numOfOps);
//						System.out.println("Precheck numOfOps=" + numOfOps);
                        return numOfOps;
                    }
                    //Case 3b(ii): Odd number
                    else {
                        numOfOps += 1;
//						System.out.println("n = " + n + " Case 3b(ii) odd number");
//						numOfOps = counter (n-1, numOfOps);
//						System.out.println("Precheck numOfOps=" + numOfOps);
                        numOfOps = Math.min(counter (n+1, numOfOps), counter (n-1, numOfOps));
                        return numOfOps;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(solution("1"));
        System.out.println(solution("240"));
    }
}
