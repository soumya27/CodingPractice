//Link: https://www.hackerrank.com/challenges/append-and-delete/problem
package HackerRank_algorithms_implementation;

public class E_AppendDelete {
    static String appendAndDelete(String s, String t, int k) {
        String result = "Yes";
        int size = Math.min(s.length(),t.length());
        int matched=0,givenMoves =k;
        for(int i =0 ;i <size;i++){
            if(s.charAt(i)==t.charAt(i))
                matched++;
            else
                break;
        }
        if( (s.length()+t.length()-2*matched)> givenMoves)
            result = "No";
        else if((s.length()+t.length()-2*matched)%2==givenMoves%2)
            result = "Yes";
        else if ( (s.length() + t.length() ) - givenMoves < 0 )
            result ="Yes";
        else
            result = "No";
        return result;
    }

    public static void main(String[] args) {

        System.out.println(appendAndDelete("hackerhappy", "hackerrank",9));
//        System.out.println(appendAndDelete("abd","abd",7));
//        System.out.println(appendAndDelete("ashley", "ash",2));
//        System.out.println(appendAndDelete("y", "yu",2));
    }
}
