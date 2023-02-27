package Vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MatHang{
    private String id, name, group;
    private float profit;
    public static int cnt = 1;
    public MatHang(String name, String group, float price_buy, float price_sell){
        this.id = String.format("MH%02d", cnt++);
        this.name = name;
        this.group = group;
        this.profit = price_sell - price_buy;
    }
    public float get_profit(){
        return this.profit;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.group + " " + String.format("%.2f", this.profit);
    }
}
public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        List<MatHang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            list.add(new MatHang(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2){
                if(o1.get_profit() < o2.get_profit()) return 1;
                return -1;
            }
        });
        for(MatHang item : list){
            System.out.println(item);
        }
    }
}
