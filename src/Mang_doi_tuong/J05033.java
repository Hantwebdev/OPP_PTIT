package Mang_doi_tuong;

import java.util.*;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

class ThoiGian{
    private int gio, phut, giay;
    public ThoiGian(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public int get_sum(){
        return gio*3600 + phut*60 + giay;
    }
    @Override
    public String toString(){
        return Integer.toString(this.gio) + " " + Integer.toString(this.phut) + " " + Integer.toString(this.giay);
    }
}
public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<ThoiGian> list = new ArrayList<>();
        while(t --> 0){
            list.add(new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list, new Comparator<ThoiGian>(){
            public int compare(ThoiGian o1, ThoiGian o2){
                if(o1.get_sum() < o2.get_sum()) return -1;
                return 1;
            }
        });
        for(ThoiGian item : list){
            System.out.println(item);
        }
        sc.close();
    }
}
