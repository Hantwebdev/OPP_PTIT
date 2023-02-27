package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt(), b = sc.nextInt();
            if(a <= 0 || b <= 0){
                System.out.println("0");
            }
            else {
                int cv = 2 * (a + b), dt = a * b;
                System.out.println(cv + " " + dt);
            }
        } finally {
            sc.close();
        }
        
    }
}
