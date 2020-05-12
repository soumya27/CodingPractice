package leetCode.Medium;

public class numberComplement {

    public static int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
//        5 is 101
//        System.out.println(binary);
        char[] binaryChar = binary.toCharArray();
        for (int i = 0 ; i < binaryChar.length; i ++){
            if (binaryChar[i]=='1')
                binaryChar[i]='0';
            else
                binaryChar[i]='1';
        }
//        complement is 010
//        System.out.println(Arrays.toString(binaryChar));
        binary = new String(binaryChar);
//        System.out.println(binary);
        return Integer.parseInt(binary,2);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(1));
    }
}
