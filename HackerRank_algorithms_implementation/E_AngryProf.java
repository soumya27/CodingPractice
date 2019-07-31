//Link: https://www.hackerrank.com/challenges/angry-professor/problem
package HackerRank_algorithms_implementation;

public class E_AngryProf {
    static String angryProfessor(int k, int[] a) {
        String result="YES";
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=0)
                count++;
        }
        if (count>=k)
            result="NO";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(angryProfessor(3, new int[]{-1, -3, 4, 2}));
        System.out.println(angryProfessor(2, new int[]{0, -1, 1, 2}));
    }
}
