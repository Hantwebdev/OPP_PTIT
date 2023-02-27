package Mang;

import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int T = sc.nextInt();
            for(int t = 1; t <= T; t++){
                int n = sc.nextInt();
                int[] a = new int[n]; int[] cnt = new int[100000];
                for(int i = 0; i < n; i++){
                    a[i] = sc.nextInt();
                    cnt[a[i]]++;
                }
                System.out.printf("Test %d:\n", t);
                for(int i = 0; i < n; i++){
                    if(cnt[a[i]] != 0){
                        System.out.printf("%d xuat hien %d lan\n", a[i], cnt[a[i]]);
                        cnt[a[i]] = 0;
                    }
                }
            }
        } finally {
            sc.close();
        }
    }
}
