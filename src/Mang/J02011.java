package Mang;
import java.util.Scanner;
public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i<n; i++) a[i] = sc.nextInt();
            int cnt = 1;
            for(int j = 0; j < n - 1; j++){
                System.out.printf("Buoc " + cnt + ": ");
                int min_idx = j; 
                for(int k = j + 1; k < n ; k++){
                    if(a[k] < a[min_idx]){
                        min_idx = k;
                    }
                }
                int tmp = a[j]; a[j] = a[min_idx]; a[min_idx] = tmp;
                for(int t = 0; t < n; t++) System.out.print(a[t] + " ");
                System.out.println("");
                cnt++;
            }
        } finally {
            sc.close();
        }
    }
}
