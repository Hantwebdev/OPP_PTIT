package Xau_ky_tu;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            BigInteger a = new BigInteger(sc.nextLine());
            System.out.println((a.mod(new BigInteger("11")).equals(new BigInteger("0")) ? "1" : "0"));
        }
        sc.close();
    }
}