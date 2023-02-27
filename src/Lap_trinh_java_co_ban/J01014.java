package Lap_trinh_java_co_ban;
import java.util.Scanner;
public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            while(t-->0){
                long n = sc.nextLong();
                int a = 1;
                for (int j = 2; j <= Math.sqrt(n); j++){
                    if(n % j == 0){
                        while(n % j == 0){
                            n /= j;
                        }
                        a = j;
                    }
                }
                if(n > 1) System.out.println(n);
                else System.out.println(a);
            }
        } finally {
            sc.close();
        }
    }
}
