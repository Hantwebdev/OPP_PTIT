package Vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
