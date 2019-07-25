//Link:https://www.hackerrank.com/challenges/time-conversion/problem

package HackerRank_algorithms_warmup;

public class E_AMPM {

    static String timeConversion(String s) {
        String array[] = s.split(":");
        StringBuilder newString = new StringBuilder();
        int hour =Integer.parseInt(array[0]);
        if(array[2].contains("PM")){
            if(hour != 12 )
                hour += 12;
            newString.append(String.valueOf(hour));
        }
        else {
            if(hour == 12 )
                newString.append("00");
            else
                newString.append(array[0]);
        }
        newString.append(":");
        newString.append(array[1]);
        newString.append(":");
        newString.append(array[2].substring(0,2));
        return newString.toString();
    }


    public static void main(String[] args) {
        String time = "12:00:00AM";
        System.out.println(timeConversion(time));
    }
}
