package Mang_doi_tuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Staff{
    public static int cnt = 1;
    private String id, ten, gioi_tinh, ngay_sinh, dia_chi, id_thue, ngay_ki_hop_dong;
    public Staff(String ten, String gioi_tinh, String ngay_sinh, String dia_chi, String id_thue, String ngay_ki_hop_dong){
        this.id = String.format("%05d", cnt++);
        this.ten = ten;
        this.gioi_tinh = gioi_tinh;
        this.ngay_sinh = ngay_sinh;
        this.dia_chi = dia_chi;
        this.id_thue = id_thue;
        this.ngay_ki_hop_dong = ngay_ki_hop_dong;
    }
    @Override
    public String toString(){
        return this.id + " " + this.ten + " " + this.gioi_tinh + " " + this.ngay_sinh + " " + this.dia_chi + " " + this.id_thue + " " +this.ngay_ki_hop_dong;
    }
}
public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Staff> list = new ArrayList<>();
        while(t-->0){
            list.add(new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(Staff item : list){
            System.out.println(item);
        }
        sc.close();
    }
}
