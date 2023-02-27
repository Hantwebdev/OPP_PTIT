package Vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int sum = 0;
        while(sc.hasNext()){
            try{
                sum += Integer.parseInt(sc.next());
            } catch (Exception e){
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
