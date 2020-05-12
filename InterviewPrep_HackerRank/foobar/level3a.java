package InterviewPrep_HackerRank.foobar;


public class level3a {

//    static int[][] p = new int[201][201];
//
//    public static void fillP() {
//        p[1][1] = 1;
//        p[2][2] = 1;
//
//        for (int w = 3; w < 201 ; w++) {
//            for (int m = 1; m <= w; m++) {
//                if (w-m == 0) {
//
//                    p[w][m] = 1 + p[w][m-1];
//
//                } else if (w-m < m) {
//
//                    p[w][m] =  p[w-m][w-m] + p[w][m-1];
//
//                } else if (w-m == m) {
//                    p[w][m] = p[m][m-1] + p[w][m-1];
//
//                } else if (w-m >m) {
//
//                    p[w][m] = p[w-m][m-1] + p[w][m-1];
//                }
//
//            }
//        }
//    }
//
//    public static int solution(int n) {
//        fillP();
//        return p[n][n] - 1;
//    }

    static int[][] p;

    public static int solution(int n) {
        int size = n+1;
        p = new int[size][size];
        p[0][0]=1;

        for (int i = 1; i <size; i++){
            for (int j =0 ; j< size; j++){
                p[i][j] = p[i-1][j];
                if (j >= i)
                    p[i][j] += p [i-1][j-i];
            }
        }
        return p[n][n] - 1;
    }


    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(200));
        System.out.println(solution(15));
    }
}
