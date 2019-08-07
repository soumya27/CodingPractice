package HackerRank_algorithms_implementation;

public class E_JumpingClouds {

    static int jumpingOnClouds(int[] c, int k) {
        int energy= 100;
        int i=0, n= c.length;
        boolean start = true;
        while(i!=0 || start ){
            if( c[i]== 1)
                energy -=2;
            energy--;
            i = (i+k)%n;
            start = false;
        }
        return energy;
    }

    public static void main(String[] args) {
        int[] c = new int[]{1,1,1,0,1,1,0,0,0,0};
        System.out.println(jumpingOnClouds(c,3));
    }
}
