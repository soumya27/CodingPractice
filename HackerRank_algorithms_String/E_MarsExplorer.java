//https://www.hackerrank.com/challenges/mars-exploration/problem
package HackerRank_algorithms_String;

public class E_MarsExplorer {

    static int findMismatch(String subset){
        int result =0;
        if(subset.charAt(0) != 'S')
            result++;
        if (subset.charAt(1) != 'O')
            result++;
        if( subset.charAt(2) != 'S')
            result++;
        return result;
    }

    static int marsExploration(String s) {
        int result=0, pointer=0;
        for(int i =0 ; i < s.length()/3 ; i++){
            if(!s.substring(pointer,pointer+3).matches("SOS")){
                result += findMismatch(s.substring(pointer,pointer+3));
            }
            pointer +=3;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(marsExploration("OSS"));
//        System.out.println(marsExploration("SOSSPSSQSSOR"));
//        System.out.println(marsExploration("SOSSOSSOS"));
    }

}
