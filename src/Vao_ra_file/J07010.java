package Vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SinhVien{
    public static int cnt = 1;
    private String id, ten, ngay_sinh, lop;
    private float gpa;
    public SinhVien(String ten, String lop, String ngay_sinh, float gpa){
        this.id = String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        this.lop = lop;
        if(ngay_sinh.charAt(1) == '/') ngay_sinh = '0' + ngay_sinh;
        if(ngay_sinh.charAt(4) == '/') ngay_sinh = ngay_sinh.substring(0, 3) + '0' + ngay_sinh.substring(3);
        this.ngay_sinh = ngay_sinh;
        this.gpa = gpa;
    }
    @Override
    public  String toString() {
        return String.format("%s %s %s %s %.2f\n", id, ten, lop, ngay_sinh, gpa);
    }
}
public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File( "SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            System.out.println(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
    }
}
