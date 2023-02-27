package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01024 {
    private static String tenary(String s) {
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character != '0' && character != '1' && character != '2')
                return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = Integer.parseInt(sc.nextLine());
            while(t-- > 0) {
                System.out.println(tenary(sc.nextLine()));
            }
        } finally {
            sc.close();
        }
    }
}