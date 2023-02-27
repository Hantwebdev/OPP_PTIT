package Xau_ky_tu;

import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String[] n = sc.nextLine().trim().toLowerCase().split("\\s+");
            StringBuilder res = new StringBuilder();
            for(String item : n){
                char[] word = item.toCharArray();
                word[0] = Character.toUpperCase(word[0]);
                res.append(new String(word));
                res.append(" ");
            }
            System.out.println(res.toString().trim());
        }
        sc.close();
    }
}
