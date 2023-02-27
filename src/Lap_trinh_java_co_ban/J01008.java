package Lap_trinh_java_co_ban;
import java.util.Scanner;
public class J01008 {
    public static void phanTich (int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                int cnt = 0;
                while(n % i == 0){
                    ++cnt;
                    n /= i;
                }
            System.out.print(i + "(" + cnt + ")" + " ");
            }
        }
        if(n > 1) System.out.print(n + "(1)");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            for(int i = 1; i <= t; i++){
                int n = sc.nextInt();
                System.out.print("Test " + i + ": ");
                phanTich(n);
                System.out.println("\n");
            }
        } finally {
            sc.close();
        }
    }
}
