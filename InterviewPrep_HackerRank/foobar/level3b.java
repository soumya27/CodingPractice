package InterviewPrep_HackerRank.foobar;

public class level3b {

    public static int solution(int[] l) {
        int count=0;
        int[] counter = new int[l.length];
        for (int i = 0 ; i <l.length; i++){
            for (int j = 0; j < i ; j++){
                if (l[i]%l[j]==0) {
                    counter[i]++;
                    count += counter[j];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1}));
    }
}

