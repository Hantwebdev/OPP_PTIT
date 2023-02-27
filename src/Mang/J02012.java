package Mang;
import java.util.Scanner;
public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i<n; i++) a[i] = sc.nextInt();
            for(int j = 0; j < n; j++){
                int pos = j - 1;
                int giaTriChen = a[j];
                while(pos >= 0 && a[pos] > giaTriChen){
                    a[pos + 1] = a[pos];
                    -- pos;
                }
                a[pos + 1] = giaTriChen;
                System.out.format("Buoc %d:", j);
                for(int t = 0; t <= j; t++) System.out.print(" " + a[t]);
                System.out.println("");
            }
        } finally {
            sc.close();
        }
    }
}
