package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01011 {
    public static long gcd(long a, long b){
        while(b != 0){
            long du = a % b;
            a = b;
            b = du;
        }
        return a;
    }

    public static long lcm(long a, long b){
        return a*b/gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            for(int i = 1; i<=t; i++){
                long n = sc.nextLong();
                long m = sc.nextLong();
                System.out.println(lcm(n, m) + " " + gcd(n, m) );
            }
        } finally {
            sc.close();
        }
    }
}
