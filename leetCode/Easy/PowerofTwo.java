package leetCode.Easy;

public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        int count =0;
        while (n>0){
            count+= n&1;
            n>>=1;
        }
        if (count == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        PowerofTwo powerofTwo = new PowerofTwo();
        if (powerofTwo.isPowerOfTwo(16))
            System.out.println("Yes");

    }
}
