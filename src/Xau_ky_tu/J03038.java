package Xau_ky_tu;

import java.util.Scanner;

public class J03038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] cnt = new int[127];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)]++;
        }
        int res = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            if (cnt[i] > 0) {
                res++;
            }
        }
        System.out.println(res);
        sc.close();
    }
}