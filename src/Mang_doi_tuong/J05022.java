package Mang_doi_tuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SinhVien{
    private String id, ten, lop, email;
    public SinhVien(String id, String ten, String lop, String email){
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public String get_lop(){
        return this.lop;
    }
    @Override
    public String toString(){
        return id + " " + ten + " " + lop + " " + email;
    }
}
public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String info = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", info);
            for(SinhVien item : list){
                if(item.get_lop().equals(info)){
                    System.out.println(item);
                }
            }
        }
        sc.close();
    }
}
