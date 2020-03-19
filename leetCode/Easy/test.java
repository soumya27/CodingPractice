package leetCode.Easy;

public class test {

    public static void main(String[] args) {
       int N =2000000;
        for (int j = 1; j < 100; j++) {
            int cutoff = (j + 1);
            if( Math.pow(cutoff,2) < cutoff*N* Math.log(N))
                System.out.println(cutoff);
//            if ( Math.pow(cutoff ,2) > cutoff *  Math.log(cutoff ))
//                System.out.println("go smaller");
        }
    }
}
