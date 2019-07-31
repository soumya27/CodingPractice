//Link: https://www.hackerrank.com/challenges/strange-advertising/problem
package HackerRank_algorithms_implementation;

public class E_StrangeAds {
    static int viralAdvertising(int n) {
        int cumulative=0;
        int shared =5, liked;
        for(int i =1;i<=n;i++){
            liked = shared/2;
            cumulative+=liked;
            shared = liked*3;
        }
        return cumulative;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }
}
