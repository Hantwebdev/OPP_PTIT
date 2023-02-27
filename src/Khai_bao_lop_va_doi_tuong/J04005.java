package Khai_bao_lop_va_doi_tuong;

import java.util.Scanner;

class ThiSinh{
    private String name, birth;
    private float point1, point2, point3, sumpoint;
    public ThiSinh(String name, String birth, float point1, float point2, float point3){
        this.name = name;
        this.birth = birth;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.sumpoint = this.point1 + this.point2 + this.point3;
    }
    @Override
    public String toString() {
        return this.name + " " + this.birth + " " + String.format("%.1f", this.sumpoint);
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh n = new ThiSinh(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
        System.out.println(n);
        sc.close();
    }
}
