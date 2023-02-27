package Khai_bao_lop_va_doi_tuong;

import java.util.Scanner;

class SinhVien{
    private String id, name, id_class, birth;
    private float gpa;
    public SinhVien(String id, String name, String id_class, String birth, float gpa){
        this.id = id;
        this.name = name;
        this.id_class = id_class;
        if(birth.charAt(1) == '/')  birth = '0' + birth;
        if(birth.charAt(4) == '/')  birth = birth.substring(0, 3) + '0' + birth.substring(3);
        this.birth = birth;
        this.birth = birth;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.id_class + " " + this.birth + " " + String.format("%.2f", this.gpa);
    }
}
public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien n = new SinhVien("B20DCCN001", sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
        System.out.println(n);
        sc.close();
    }
}
