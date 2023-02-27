package Mang;

import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            while(t --> 0){
                int n = sc.nextInt();
                int[] a = new int[n];
                int sum = 0;
                for(int i = 0; i < n; i++){
                    a[i] = sc.nextInt();
                    sum += a[i];
                }
                int res = -1; 
                int suml = 0; int sumr = sum - a[0];
                for(int i = 1; i < n; i++){
                    suml += a[i-1];
                    sumr -= a[i];
                    if(suml == sumr){
                        res = i + 1;
                        break;
                    }
                }
                System.out.println(res);
            }
        } finally {
            sc.close();
        }
    }
}
