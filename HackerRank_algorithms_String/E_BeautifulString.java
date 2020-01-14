package HackerRank_algorithms_String;

public class E_BeautifulString {

    static int beautifulBinaryString(String input){
//        String regex = "010";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        int from = 0;
//        int count = 0;
//        while(matcher.find(from)) {
//            count++;
//            from = matcher.start() + 1;
//        }
//        return count-1;
        return (input.length() - input.replaceAll("010", "").length())/3;
    }

    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0101010"));
        System.out.println(beautifulBinaryString("0100101010"));
    }
}
