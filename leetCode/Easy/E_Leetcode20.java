//Link:https://leetcode.com/problems/valid-parentheses/
package leetCode.Easy;

import java.util.Stack;

public class E_Leetcode20 {
    public static boolean isValid(String s) {
        if (s.length()%2 !=0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (Character character : s.toCharArray()){
            switch(character){
                case '(':
                case '{':
                case '[':
                    stack.push(character);
                    break;
                case ')':{
                    if (!stack.isEmpty()){
                        Character popped = stack.pop();
                        if (!popped.equals('(') )
                            return false;
                    }
                    break;
                }
                case '}':{
                    if (!stack.isEmpty()){
                        Character popped = stack.pop();
                        if (!popped.equals('{') )
                            return false;
                    }
                    break;
                }
                case ']':{
                    if (!stack.isEmpty()){
                        Character popped = stack.pop();
                        if (!popped.equals('[') )
                            return false;
                    }
                    break;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]{}"));
    }
}
