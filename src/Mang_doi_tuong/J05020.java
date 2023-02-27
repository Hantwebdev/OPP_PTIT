package Mang_doi_tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {

    private String id;
    private String name;
    private String className;
    private String email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String get_Id() {
        return id;
    }

    public String get_ClassName() {
        return className;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}

public class J05020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        while(t-->0) {
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new Comparator<Student>(){
            public int compare(Student o1, Student o2){
                if(o1.get_ClassName().equals(o2.get_ClassName())){
                    if(o1.get_Id().compareTo(o2.get_Id()) < 0) return -1;
                    return 1;
                } else {
                    if(o1.get_ClassName().compareTo(o2.get_ClassName()) < 0) return -1;
                    return 1;
                }
            }
        });
        for (Student item : list) {
            System.out.println(item);
        }
        sc.close();
    }
}