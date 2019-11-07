//Link:https://leetcode.com/problems/backspace-string-compare/
package leetCode.Easy;

import java.util.Stack;

public class Backspace {

    public boolean backspaceCompare(String S, String T) {
        String resultS, resultT;
        resultS = prepareStack(S);
        resultT = prepareStack(T);
        return resultS.equals(resultT);
    }

    public String prepareStack(String data){
        Stack<Character> characterStack = new Stack<Character>();
        for(int i = 0 ; i < data.length(); i++){
            if(data.charAt(i)!='#')
                characterStack.push(data.charAt(i));
            else {
                if(!characterStack.empty())
                    characterStack.pop();
            }
        }
        return characterStack.toString();
    }

    public static void main(String[] args) {
        Backspace backspace = new Backspace();
        System.out.println(backspace.backspaceCompare("a#c","b#c"));
    }
}
