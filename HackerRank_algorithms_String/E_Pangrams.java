//https://www.hackerrank.com/challenges/pangrams/problem?isFullScreen=true
package HackerRank_algorithms_String;

public class E_Pangrams {

    static String pangrams(String s) {
        s = s.toLowerCase();
        for(int i=97; i<=122; i++){
            if(s.indexOf(i) == -1 )
                return "not pangrams";
        }
        return "pangrams";
    }

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }
}
