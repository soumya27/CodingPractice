package leetCode.Easy;
//Link: https://leetcode.com/problems/valid-mountain-array/

public class ValidMountain {

    public boolean validMountainArray(int[] a) {
        boolean reverse = false;
        if(a.length < 3){
            return false;
        }

        for(int i=0 ; i<a.length-1;i++){
           if(!reverse){
               if(a[i+1]<a[i])
                   reverse = true;
               if(a[i+1]==a[i])
                   return false;
           }else{
               if(a[i+1]>=a[i])
                   return false;
           }
        }
        return reverse;
    }

    public static void main(String[] args) {
        ValidMountain validMountain = new ValidMountain();
        if(validMountain.validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}))
            System.out.println("True");
        else
            System.out.println("False");
    }

}
