
package Mang;

import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = Integer.parseInt(sc.nextLine());
            while(t --> 0){
                String n = sc.nextLine();
                String[] a = n.split("");
                int sum = Integer.parseInt(a[0]);
                String res = "YES";
                for(int i = 1; i < a.length; i++){
                    if(Math.abs(Integer.parseInt(a[i]) - Integer.parseInt(a[i - 1])) != 2){
                        res = "NO";
                        break;
                    }
                    sum += Integer.parseInt(a[i]);
                }
                if(sum % 10 != 0) res = "NO";
                System.out.println(res);
            }
        } finally {
            sc.close();
        }
    }
}
