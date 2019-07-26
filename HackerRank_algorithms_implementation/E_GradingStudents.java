//Link:https://www.hackerrank.com/challenges/grading/problem
package HackerRank_algorithms_implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E_GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int round=0;
        int digit,mark;
        for(int i=0; i<grades.size();i++){
            mark = grades.get(i);
            if(mark>=38){
                digit = mark%10;
                if(digit!=0 && digit!=5 && digit<5)
                    round = 5-digit;
                else if (digit>5)
                    round = 10-digit;
                else
                    round=0;

                if(round!=0 && round <3)
                    mark= mark+round;
                grades.set(i,mark);
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>(Arrays.asList(
           4,67,73,38,33,80,100,55
        ));
        System.out.println(gradingStudents(grades));
    }
}
