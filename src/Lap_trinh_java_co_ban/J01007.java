package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01007 {
    public static String checkFibonacci (long n){
        if(n==0 || n == 1) return "YES";
        else {
            long f0 = 0, f1 = 1, fn ;
            for(int i = 2; i <= 93; i++){
                fn = f0 + f1;
                if(fn == n) return "YES";
                f0 = f1;
                f1 = fn;
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            while(t --> 0){
                long n = sc.nextLong();
                System.out.println(checkFibonacci(n));
            }
        } finally {
            sc.close();
        }
    }
}
