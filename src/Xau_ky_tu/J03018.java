package Xau_ky_tu;

import java.util.Scanner;

public class J03018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = 0, n = s.length();
            if (n == 1) {
                k = s.charAt(0) - '0';
            } else {
                k = (s.charAt(n - 2) - '0') * 10 + s.charAt(n - 1) - '0';
            }
            if (k % 4 == 0) {
                System.out.println(4);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}