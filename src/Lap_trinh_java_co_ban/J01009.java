package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            long n = sc.nextLong();
            long factorial = 1, sum = 0;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
                sum += factorial;
            }
            System.out.println(sum);
        } finally {
            sc.close();
        }  
    }
}