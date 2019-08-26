//https://www.hackerrank.com/challenges/halloween-sale/problem
package HackerRank_algorithms_implementation;

public class E_HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
        int  cost = p, count =0 ;
        int totalCost=p;
        while(totalCost <= s){
            if( cost-d <= m )
                cost = m;
            else
                cost = cost-d;
            totalCost += cost;
            System.out.println("Total Cost: "+totalCost);
            System.out.println("Cost: "+cost);
            count++;
            System.out.println("Count: "+count);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(20,3,6,85));
    }
}
