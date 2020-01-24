//Link:https://www.hackerrank.com/challenges/encryption/problem
package HackerRank_algorithms_implementation;

public class M_Encryption {
    static String encryption(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        int row = (int) Math.floor(Math.sqrt(n));
        int col = (int) Math.ceil(Math.sqrt(n));
        System.out.println(n+"\n"+row + "\n" + col);

        for (int i = 0; i < row; i++) {
            for (int j = i; j < n; j += col) {
                result.append(s.charAt(j));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
//        System.out.println(encryption("chillout"));
//        System.out.println(encryption("haveaniceday"));
        System.out.println(encryption("iffactsdontfittotheorychangethefacts"));
        //isieae fdtonf fotrga anoyec cttctt tfhhhs
        //isieae fdtonf fotrga anoyec cttctt tfhhhs
    }
}
