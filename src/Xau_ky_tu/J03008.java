package Xau_ky_tu;

import java.util.Scanner;

public class J03008 {
    public static String check(String n){
        int len = n.length();
        for(int i = 0; i < len/2; i++){
            if(n.charAt(i) != n.charAt(len - i - 1)){
                return "NO";
            }
            if(n.charAt(i) != '2' && n.charAt(i) != '3' && n.charAt(i) != '5' && n.charAt(i) != '7'){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String n = sc.nextLine();
            System.out.println(check(n));
        }
        sc.close();
    }
}
