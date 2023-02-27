package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            char[] str = sc.nextLine().toCharArray();
            int cnt = 0;
            for(char i : str) {
                if(i == '4' || i == '7') ++cnt;
            }
            System.out.println((cnt == 4 || cnt == 7) ? "YES" : "NO");
        } finally {
            sc.close();
        }
    }
}
