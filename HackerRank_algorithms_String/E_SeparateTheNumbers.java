package HackerRank_algorithms_String;

public class E_SeparateTheNumbers {
    static void separateNumbers(String s) {
        int len = s.length();
        if(len==1)
            System.out.println("NO");


    }

    public static void main(String[] args) {
        separateNumbers("1234");
        separateNumbers("99910001001");
        separateNumbers("7891011");
        separateNumbers("010203");
        separateNumbers("13");
        separateNumbers("1");
    }
}
