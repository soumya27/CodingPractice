//Link:https://leetcode.com/problems/find-all-good-strings/
package leetCode.contest;

public class H_Weekly1397 {
    public static int findGoodStrings(int n, String s1, String s2, String evil) {
    int result = 0 ;
    StringBuilder Bs1 = new StringBuilder(s1);

    for (int i = 1; i< s1.length(); i ++){
        while (Bs1.charAt(i) < 122){
            String value = String.valueOf(Character.toChars(Bs1.charAt(i)+1));
            Bs1.deleteCharAt(i);
            Bs1.replace(i,i, value);
            if ( Bs1.toString().compareTo(s1) > 0 && Bs1.toString().compareTo(s2) < 0 && !Bs1.toString().contains(evil))
                result++;
        }
    }

    for ( int i = 0; i <s2.length();i++){
        StringBuilder Bs2 = new StringBuilder(s2);
        Bs2.reverse();
        while (Bs2.charAt(i) >97){
            String value = String.valueOf(Character.toChars(Bs2.charAt(i)-1));
            Bs2.deleteCharAt(i);
            Bs2.replace(i,i, value);
            String compare = Bs2.reverse().toString();
            if ( compare.compareTo(s1) >= 0 && compare.compareTo(s2)< 0 && !compare.contains(evil))
                result++;
            Bs2.reverse();
        }

    }
    return result;
    }

    public static void main(String[] args) {
        System.out.println(findGoodStrings(2,"aa", "da","b"));
    }
}
