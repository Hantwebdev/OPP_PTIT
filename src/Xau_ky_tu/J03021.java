package Xau_ky_tu;

import java.util.Scanner;
public class J03021 {
    public static char trans(char c) {
        if(c <= 'C') return '2';
        if(c <= 'F') return '3';
        if(c <= 'I') return '4';
        if(c <= 'L') return '5';
        if(c <= 'O') return '6';
        if(c <= 'S') return '7';
        if(c <= 'V') return '8';
        return '9';
    }
    public static String phone(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++)
            res += trans(s.charAt(i));
        return res;
    }
    public static String reversible(String s) {
        for (int i = 0; i < s.length()/2; i++)
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s = sc.nextLine().toUpperCase();
            String res = phone(s);
            System.out.println(reversible(res));
        }
        sc.close();
    }
}

