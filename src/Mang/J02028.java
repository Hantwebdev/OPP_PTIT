package Mang;

import java.util.Scanner;

public class J02028 {
    private static String somethingIsntCorrect(int[] a, long k, int n) {
        long sum = 0;
        int indexBegin = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            while(sum > k) {
                sum -= a[indexBegin];
                indexBegin++;
            }
            if (sum == k && indexBegin != i+1) {
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            System.out.println(somethingIsntCorrect(a, k, n));
        }
        sc.close();
    }
}
