package Vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class DoanhNghiep{
    private String id, ten, sl;
    public DoanhNghiep(String id, String ten, String sl){
        this.id = id;
        this.ten = ten;
        this.sl = sl;
    }
    public String get_id(){
        return this.id;
    }
    @Override
    public String toString(){
        return id + " " + ten + " " + sl;
    }
}
public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File( "DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> list = new ArrayList<>();
        while(t-->0){
            list.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2){
                if(o1.get_id().compareTo(o2.get_id()) < 0) return -1;
                return 1;
            }
        });
        for(DoanhNghiep item : list) System.out.println(item);
    }
}
