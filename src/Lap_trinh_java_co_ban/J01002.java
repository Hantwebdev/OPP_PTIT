package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while(t --> 0){
                long n = sc.nextInt();
                System.out.println(n * (n + 1) / 2);
            }
        } finally {
            sc.close();
        }
    }
}
