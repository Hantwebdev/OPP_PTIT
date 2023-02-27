package Lap_trinh_java_co_ban;
import java.util.Scanner;

public class J01010 {
    public static void solve(String s){
        int ok = 0; 
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') ok = 1;
            else if(!(s.charAt(i) == '8' ||s.charAt(i) == '9' ||s.charAt(i) == '0')){
                ok = 0;
                break;
                }
        }
        if(ok != 1){
            System.out.print("INVALID\n");
            return;
        } 
        int check = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') {System.out.print("1"); check = 1;}
            else if(check != 0)  System.out.print("0");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            sc.nextLine();
            while(t-->0){
                String s = sc.nextLine();
                solve(s);
            } 
        } finally {
            sc.close();
        }
                 
    }
}