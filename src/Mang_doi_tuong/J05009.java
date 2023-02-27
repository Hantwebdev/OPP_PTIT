package Mang_doi_tuong;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    public static int NUM = 1;
    public int id;
    public String name, dob;
    public Float p1, p2, p3, total;

    public Student(String name, String dob, float p1, float p2, float p3) {
        this.id = NUM++;
        this.name = name;
        this.dob = dob;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.total = p1 + p2 + p3;
    }
    public float get_total(){
        return this.total;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + dob + " " + total;
    }
}

public class J05009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        float max = 0;
        ArrayList<Student> list = new ArrayList<>();
        while(t-->0){
            Student x = new Student(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            list.add(x);
            if(x.get_total() > max) max = x.get_total();
        }
        for(Student item : list){
            if(item.get_total() == max){
                System.out.println(item);
            }
        }
        sc.close();
    }
}