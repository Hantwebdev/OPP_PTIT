package Mang_doi_tuong;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class DanhSach{
    public static int cnt = 1;
    private String id, ten, don_vi;
    private int gia_mua, gia_ban, loi_nhuan;
    public DanhSach(String ten, String don_vi, int gia_mua, int gia_ban){
        this.id = "MH" + String.format("%03d", cnt++);
        this.ten = ten;
        this.don_vi = don_vi;
        this.gia_mua = gia_mua;
        this.gia_ban = gia_ban;
        this.loi_nhuan = this.gia_ban - this.gia_mua;
    }
    public String get_id(){
        return this.id;
    }
    public int get_loi_nhuan(){
        return this.loi_nhuan;
    }
    @Override
    public String toString(){
        return this.id + " " + this.ten + " " + this.don_vi + " " + this.gia_mua + " " + this.gia_ban + " " + this.loi_nhuan;
    }
}
public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<DanhSach> list = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
            list.add(new DanhSach(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list, new Comparator<DanhSach>() {
            @Override
            public int compare(DanhSach o1, DanhSach o2){
                if(o1.get_loi_nhuan() == o2.get_loi_nhuan()){
                    if(o1.get_id().compareTo(o2.get_id()) < 0) return -1;
                    return 1;
                } else {
                    if(o1.get_loi_nhuan() < o2.get_loi_nhuan()) return 1;
                    return -1;
                }
            }
        });
        for(DanhSach item : list){
            System.out.println(item);
        }
        sc.close();
    }
}
