//Link:https://leetcode.com/problems/defanging-an-ip-address/
package leetCode.Easy;

public class E_Leetcode1108 {
    public static String defangIPaddr(String address) {
        return address.replaceAll("[.]","[.]");
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
