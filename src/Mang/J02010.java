package Mang;
import java.util.Scanner;
public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i<n; i++) a[i] = sc.nextInt();
            int cnt = 1;
            for(int j = 0; j < n - 1 ; j++){
                System.out.printf("Buoc " + cnt + ": ");
                for(int k = j + 1; k < n; k++){
                    if(a[j] > a[k]){
                        int tmp = a[j]; a[j] = a[k]; a[k] = tmp;
                    }
                }
                for(int t = 0; t < n; t++) System.out.print(a[t] + " ");
                System.out.println("");
                cnt++;
            }
        } finally {
            sc.close();
        }
    }
}
