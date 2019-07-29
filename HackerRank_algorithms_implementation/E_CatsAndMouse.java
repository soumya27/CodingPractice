//Link:https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
package HackerRank_algorithms_implementation;

public class E_CatsAndMouse {
    static String catAndMouse(int x, int y, int z) {
        String winner="";
        int catADistance = Math.abs(z-x), catBDistance=Math.abs(z-y);
        if( catADistance > catBDistance)
            winner= "Cat B";
        else if( catADistance < catBDistance)
            winner="Cat A";
        else
            winner="Mouse C";

        return winner;
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(3,7,2));
    }

}
