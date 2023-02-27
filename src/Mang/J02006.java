package Mang;
import java.util.Scanner;
public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt(), m = sc.nextInt();
            int[] a = new int[n]; int[] b = new int[m];
            int[] a1 = new int[1000]; int[] b1 = new int[1000];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                a1[a[i]]++;
            } 
            for(int i = 0; i < m; i++){
                b[i] = sc.nextInt();
                b1[b[i]]++;
            }
            for(int j = 0; j < 1000; j++){
                if(a1[j] != 0 || b1[j] != 0){
                    System.out.print(j + " ");
                }
            }
        } finally {
            sc.close();
        }
    }
}
