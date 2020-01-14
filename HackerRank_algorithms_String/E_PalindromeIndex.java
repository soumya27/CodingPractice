package HackerRank_algorithms_String;

public class E_PalindromeIndex {

//    static int palindromeIndex(String s) {
//        int index = -1;
//        int i =0 , j = s.length()-1;
//
//        while (i<j){
//            if(s.charAt(i)!=s.charAt(j)){
//                if(s.charAt(i+1)==s.charAt(i)) {
//                    index = j;
//                    j--;
//                }else {
//                    index = i;
//                    i++;
//                }
//            } else {
//               i++;
//               j--;
//            }
//        }
//        return index;
//    }

    static int palindromeIndex(String s){
        for(int i =0,j =s.length()-1; i<j; i++, j--)
            if(s.charAt(i)!=s.charAt(j))
                if(isPalindrome(s, i))
                    return i;
                else if(isPalindrome(s, j))
                    return j;
        return -1;
    }

    static boolean isPalindrome(String s, int index){
        for(int i =index+1,j =s.length()-1-index; i<j; i++, j--)
            if(s.charAt(i)!=s.charAt(j))
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindromeIndex("aaa"));
    }
}
