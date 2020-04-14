package InterviewPrep_HackerRank;


import java.util.HashMap;

public class Braille_Solution {


    public static void main(String[] args) {
        String output = solution("BRAILLE");
        System.out.println(output);
    }


    public static String solution(String s) {

        //Mapping relevant Braille characters
        char[] alphabets = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ','$'};
        String[] values = new String[]{"100000", "110000", "100100", "100110", "100010", "110100", "110110", "110010", "010100", "010110"
                , "101000", "111000", "101100", "101110", "101010", "111100", "111110", "111010", "011100", "011110", "101001", "111001", "010111"
                , "101101", "101111", "101011", "000000", "000001"};

        HashMap<Character, String> braille = new HashMap<>();
        for (int i =0 ; i <alphabets.length; i ++){
            braille.put(alphabets[i],values[i]);
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                output.append(braille.get('$'));
                output.append(braille.get(Character.toLowerCase(s.charAt(i))));
            } else if (s.charAt(i) == ' ') {
                output.append(braille.get(s.charAt(i)));
            } else {
                output.append(braille.get(s.charAt(i)));
            }
        }
        return output.toString();
    }
}

