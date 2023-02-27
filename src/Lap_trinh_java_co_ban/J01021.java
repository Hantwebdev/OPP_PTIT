package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01021 {
    private static final int Mod = (int) (1e9+7);
    private static long Pow(long a, long b) {
        if (b == 0) return 1;
        long Pow50 = Pow(a, b/2);
        if(b%2 == 0) return Pow50 % Mod * Pow50 % Mod;
        return Pow50 % Mod * Pow50 % Mod * a % Mod;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                if (a+b == 0) break;
                System.out.println(Pow(a, b));
            }
        } finally {
            sc.close();
        } 
    }
}