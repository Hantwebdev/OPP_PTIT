package Mang_doi_tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Product{
    public static int NUM = 1;
    public int id;
    public String name, kind;
    public Float cost, price, profit;

    public Product(String name, String type, float cost, float price) {
        this.id = NUM++;
        this.name = name;
        this.kind = type;
        this.cost = cost;
        this.price = price;
        this.profit = price - cost;
    }
    public float get_profit(){
        return this.profit;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + kind + " " + String.format("%.2f", profit);
    }
}

public class J05010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> list = new ArrayList<>();
        while(n-->0) {
            list.add(new Product(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<Product>() {
            public int compare(Product o1, Product o2){
                if(o1.get_profit() < o2.get_profit()) return 1;
                return -1;
            }
        });
        for(Product item : list){
            System.out.println(item);
        }
        sc.close();
    }
}

