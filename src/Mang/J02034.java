package Mang;

import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int numMax = 0;
            int[] a = new int[n], m = new int[205];
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
                m[a[i]] = 1;
                numMax = Integer.max(numMax, a[i]);
            }
            boolean ok = true;
            for (int i = 1; i <= numMax; i++) {
                if(m[i] == 0) {
                    System.out.println(i);
                    ok = false;
                }
            }
            if (ok) System.out.println("Excellent!");
        } finally {
            sc.close();
        }
    }
}

