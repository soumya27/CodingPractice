//https://www.hackerrank.com/challenges/taum-and-bday/problem
package HackerRank_algorithms_implementation;

public class E_TaumAndBday {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long result=0;
        long lb = b, lw = w, lbc = bc , lwc = wc, lz = z;
        if(lbc > lwc && (lwc+lz) < lbc )
            lbc =lwc+lz;
        else if (lwc > lbc && (lbc+lz) < lwc)
            lwc = lbc+lz;

        result = (lb*lbc) + (lw*lwc);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(taumBday(10,10,1,1,1));
        System.out.println(taumBday(5,9,2,3,4));
        System.out.println(taumBday(3,6,9,1,1));
        System.out.println(taumBday(7,7,4,2,1));
        System.out.println(taumBday(3,3,1,9,2));
    }
}
