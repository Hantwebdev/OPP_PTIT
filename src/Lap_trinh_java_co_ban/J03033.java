package Lap_trinh_java_co_ban;
import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = Integer.parseInt(sc.nextLine());
            while(t-- > 0) {
                BigInteger a = new BigInteger(sc.nextLine());
                BigInteger b = new BigInteger(sc.nextLine());
                BigInteger gcd = a.gcd(b);
                BigInteger res = a.multiply(b).divide(gcd);
                System.out.println(res);
            }
        } finally {
            sc.close();
        }
    }
}