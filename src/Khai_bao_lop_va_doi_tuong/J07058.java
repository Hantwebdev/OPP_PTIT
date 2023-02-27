package Khai_bao_lop_va_doi_tuong;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
class DanhSach{
    private String id, name, form;
    public DanhSach(String id, String name, String form){
        this.id = id;
        this.name = name;
        this.form = form;
    }
    public String get_id(){
        return this.id;
    }
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.form;
    }
}
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<DanhSach> list = new ArrayList<>();
        while(t --> 0){
            list.add(new DanhSach(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new Comparator<DanhSach>() {
            @Override
            public int compare(DanhSach o1, DanhSach o2){
                if(o1.get_id().compareTo(o2.get_id()) < 0){
                    return -1;
                }
                return 1;
            }
        });
        for(DanhSach item : list){
            System.out.println(item);
        }
    }
}
