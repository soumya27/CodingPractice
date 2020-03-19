//Link:https://www.hackerrank.com/contests/hack-the-interview-u-s-2/challenges/playing-cards-1-1
package InterviewPrep_HackerRank;

public class M_DetermineWinner {
    public static String getRoundResult(char winning_suit, char suit1, int number1, char suit2, int number2) {
        if(suit1 == suit2 || suit1!=suit2 && suit1 != winning_suit && suit2!=winning_suit){
            if (number1>number2)
                return "Player 1 wins";
            else if (number2>number1)
                return "Player 2 wins";
        }else if (suit1 == winning_suit){
            return "Player 1 wins";
        }else if (suit2 == winning_suit){
            return "Player 2 wins";
        }
        return "Draw";
    }

    public static void main(String[] args) {
        System.out.println(getRoundResult('B', 'A',2, 'B', 1));
        System.out.println(getRoundResult('B', 'A',7, 'D', 2));
        System.out.println(getRoundResult('B', 'B',5, 'D', 13));
        System.out.println(getRoundResult('B', 'B',3, 'B', 1));
        System.out.println(getRoundResult('B', 'A',12, 'C', 12));
    }
}
