package Khai_bao_lop_va_doi_tuong;

import java.util.Scanner;
class Teacher{
    private String id, name;
    private int basic_salary, wage, allowance, income;
    public Teacher(String id, String name, int basic_salary){
        this.id = id;
        this.name = name;
        if(this.id.substring(0, 2).equals("HT")) this.allowance = 2000000;
        else if(this.id.substring(0, 2).equals("HP")) this.allowance = 900000;
        else this.allowance = 500000;
        this.wage = Integer.parseInt(this.id.substring(2));
        this.basic_salary = basic_salary;
        this.income = this.basic_salary * this.wage + this.allowance;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.wage + " " + this.allowance + " " + this.income;
    }
}
public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher n = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(n);
        sc.close();
    }
}
