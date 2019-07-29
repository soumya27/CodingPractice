//Link: https://www.hackerrank.com/challenges/day-of-the-programmer/problem
package HackerRank_algorithms_implementation;

public class E_DayOfProgrammer {

    static String dayOfProgrammer(int year) {
        String date="";
        if(year>=1700 && year<=2700){
            if(year < 1918 )
                date += (year%4 == 0)? "12.09."+year : "13.09."+year;
            else if( year ==1918)
                date = "26.09.1918";
            else {
                date+= ((year%400 == 0) || (year%4==0 && year%100 !=0)) ? "12.09."+year : "13.09."+year;
            }
        }
        else
            System.out.println("Invalid input");
        return date;
    }

    public static void main(String[] args) {
        int year =1800;
        System.out.println(dayOfProgrammer(year));
    }
}
