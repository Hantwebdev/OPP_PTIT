package Xau_ky_tu;

import java.math.BigInteger;
import java.util.Scanner;

public class J03012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.add(b).toString());
        }
        sc.close();
    }
}