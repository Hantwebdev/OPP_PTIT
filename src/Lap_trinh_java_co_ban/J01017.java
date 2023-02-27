package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = Integer.parseInt(sc.nextLine());
            while(t-- > 0) {
                String str = sc.nextLine();
                String res = "YES";
                for (int i = 1; i < str.length(); i++) {
                    if (Math.abs(Character.getNumericValue(str.charAt(i)) - Character.getNumericValue(str.charAt(i-1))) != 1) {
                        res = "NO";
                        break;
                    }
                }
                System.out.println(res);
            }
        } finally {
            sc.close();
        }  
    }
}

//Character.getNumericValue: trả về giá trị số của ký tự, dưới dạng giá trị int không âm; -2 nếu ký tự có giá trị số không phải là số nguyên không âm; -1 nếu ký tự không có giá trị số