package Khai_bao_lop_va_doi_tuong;

import java.util.Scanner;
class Staff{
    private String id, name, sex, birth, adress, id_tax, date;
    public Staff(String id, String name, String sex, String birth, String adress, String id_tax, String date){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.adress = adress;
        this.id_tax = id_tax;
        this.date = date;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.sex + " " + this.birth + " " + this.adress + " " + this.id_tax + " " + this.date;
    }
}
public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff n = new Staff("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(n);
        sc.close();
    }
}
