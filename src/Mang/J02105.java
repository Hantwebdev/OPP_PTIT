package Mang;

import java.util.Scanner;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.format("List(%d) = ", i);
                for (int j = 1; j <= n; j++) {
                    if(sc.nextInt() == 1) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println("");
            }
        } finally {
            sc.close();
        }
    }
}
