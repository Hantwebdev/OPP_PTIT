package Mang;

import java.util.Scanner;


public class J02101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++)
                        a[j] = sc.nextInt();
                    if (i % 2 == 0) {
                        for (int k : a)
                            System.out.print(k + " ");
                    }
                    else {
                        for (int j = n-1; j >= 0; --j)
                            System.out.print(a[j] + " ");
                    }
                }
                System.out.println("");
            }
        } finally {
            sc.close();
        }
    }
}

