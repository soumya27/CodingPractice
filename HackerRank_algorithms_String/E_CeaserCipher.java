//https://www.hackerrank.com/challenges/caesar-cipher-1/problem
package HackerRank_algorithms_String;

public class E_CeaserCipher {
    static String caesarCipher(String s, int k) {
        StringBuffer result = new StringBuffer();
        int start=96;
        int ciphered;
        for(int i =0 ; i < s.length(); i++){
            if (!Character.isAlphabetic(s.charAt(i)))
            {
                result.append(s.charAt(i));
            }
            else {
                k = k % 26;
                ciphered =(int)s.charAt(i)+k;
                int diff;
                int last;
                if(Character.isLowerCase(s.charAt(i))) {
                    last = (int) ('z');
                }
                else {
                    last = (int) ('Z');
                    start = (int)('A') -1;
                }

                if (ciphered > last){
                    diff = ciphered - last;
                    result.append((char) (start + diff));
                }
                else
                    result.append((char) ciphered);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("Q'",100));
    }
}
