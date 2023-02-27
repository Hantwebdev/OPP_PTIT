package Khai_bao_lop_va_doi_tuong;

import java.util.Scanner;
class Officer{
    private String id, name;
    private int month_salary, bonus, allowance, income;
    public Officer(String id, String name, int basic_salary, int days_work, String position){
        this.id = id;
        this.name = name;
        this.month_salary = basic_salary * days_work;
        if(days_work >= 25) this.bonus = (int) (this.month_salary * 0.2);
        else if(days_work >= 22) this.bonus = (int) (this.month_salary * 0.1);
        else this.bonus = 0;
        if(position.equals("GD")) this.allowance = 250000;
        else if(position.equals("PGD")) this.allowance = 200000;
        else if(position.equals("TP")) this.allowance = 180000;
        else this.allowance = 150000;
        this.income = this.month_salary + this.bonus + this.allowance;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.month_salary + " " + this.bonus + " " + this.allowance + " " + this.income;
    }
}
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new Officer("NV01", sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        sc.close();
    }
}
