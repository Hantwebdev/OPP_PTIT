package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01012 {
    public static void check(long n){
        if(n % 2 != 0 ) System.out.println("0");
        else {
            int cnt = 0;
            for(int i = 1; i <= Math.sqrt(n); i++){
                if(n % i==0){
                    if(i % 2==0) ++cnt;
                    if((n/i) % 2==0) ++cnt;
                    if(i == n/i) --cnt;
                }
            }
            System.out.println(cnt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            while(t --> 0){
                int n = sc.nextInt();
                check(n);
            }
        } finally {
            sc.close();
        }       
    }
}
