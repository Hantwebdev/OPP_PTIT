package Lap_trinh_java_co_ban;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "Hello.txt";
        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            while(sc.hasNextLine())
                System.out.println(sc.nextLine());
        }   
    } 
}
