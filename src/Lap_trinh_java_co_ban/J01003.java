package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            float a = sc.nextFloat(), b = sc.nextFloat();
            if(a == 0 && b != 0) {
                System.out.println("VN");
            }
            else if(a == 0 && b == 0){
                System.out.println("VSN");
            }
            else{
                System.out.printf("%.2f",-b / a);
            }
        } finally {
            sc.close();
        }
    }
}
