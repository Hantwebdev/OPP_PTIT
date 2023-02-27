package Mang;

import java.util.Scanner;

public class J02004 {
    public static String check(int[] a, int n){
        int l = 0, r = n - 1;
        while(l <= r){
            if(a[l] != a[r]) return "NO";
            ++l; --r;
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            while(t --> 0){
                int n = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0; i < n; i++) a[i] = sc.nextInt();
                System.out.println(check(a, n));
            }
        } finally {
            sc.close();
        }
    }
}
