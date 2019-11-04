package leetCode.Easy;

public class ReverseStringR {

    public static void stringReverse(char[] str){
        helper(0,str);
    }

    public static void helper( int index, char[] str){
        if(str == null || index>=str.length){
            return;
        }
        helper(index+1,str);
        System.out.print(str[index]);
    }

    public static void main(String[] args) {
        stringReverse(new char[] {'S','O','U','M','Y','A'});
    }
}
