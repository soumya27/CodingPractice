package HackerRank_algorithms_String;

public class E_hackerrankInString {

    static String hackerrankInString(String s) {
        String required = "hackerrank";
        for (int j=0,i=0;j<s.length();j++){
            if(s.charAt(j)==required.charAt(i))
                i++;
            if(i==required.length())
                return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereiamstackerracnss"));
    }
}
