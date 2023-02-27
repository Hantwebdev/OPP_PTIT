package Vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MonHoc{
    private String id, ten, tc;
    public MonHoc(String id, String ten, String tc){
        this.id = id;
        this.ten = ten;
        this.tc = tc;
    }
    public String get_ten(){
        return this.ten;
    }
    @Override
    public String toString(){
        return id + " " + ten + " " + tc;
    }
}
public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File( "MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<MonHoc> list = new ArrayList<>();
        while(t-->0){
            list.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2){
                if(o1.get_ten().compareTo(o2.get_ten()) < 0) return -1;
                return 1;
            }
        });
        for(MonHoc item : list) System.out.println(item);
    }
}
