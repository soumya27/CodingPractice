//https://www.hackerrank.com/challenges/strong-password/problem
package HackerRank_algorithms_String;

public class E_StrongPassword {

    static int minimumNumber(int n, String password) {
        int count = 0;
        if(!password.matches(".*\\d+.*"))
            count++;
        if(!password.matches(".*[a-z]+.*"))
            count++;
        if (!password.matches(".*[A-Z]+.*"))
            count++;
        if(! password.matches(".*[!@#$%^&*()\\-+]+.*"))
            count++;

        return Math.max(count,6-n);
    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(7,"AUzs-nV"));
    }

}
