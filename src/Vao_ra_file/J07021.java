package Vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            if(s.equals("END")){
                break;
            }
            else{
                String[] n = s.trim().toLowerCase().split("\\s+");
                StringBuilder res = new StringBuilder();
                for(String item : n){
                    char[] word = item.toCharArray();
                    word[0] = Character.toUpperCase(word[0]);
                    res.append(new String(word));
                    res.append(" ");
                }
                System.out.println(res.toString().trim());
            }
        }
    }
}
