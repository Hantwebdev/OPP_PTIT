package Mang;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02008 {
    static List<BigInteger> lcms = new ArrayList<>();
    
    static void Def() {
        lcms.add(new BigInteger("1"));
        lcms.add(new BigInteger("1"));
        for (int i = 2; i < 45; i++) {
            BigInteger I = new BigInteger(Integer.toString(i));
            BigInteger gcd = I.gcd(lcms.get(i-1));
            lcms.add(I.multiply(lcms.get(i-1).divide(gcd)));
        }
    }
    
    public static void main(String[] args) {
        Def();
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            while(t-- > 0) {
                System.out.println(lcms.get(sc.nextInt()));
            }
        } finally {
            sc.close();
        }
    }
}