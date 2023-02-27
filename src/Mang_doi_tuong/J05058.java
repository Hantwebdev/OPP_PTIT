package Mang_doi_tuong;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class J05058 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("THISINH.in"));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            students.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        students.sort((Student a, Student b) -> {
            if(Double.parseDouble(a.getScore()) < Double.parseDouble(b.getScore()))
                return 1;
            if(Double.parseDouble(a.getScore()) > Double.parseDouble(b.getScore()))
                return -1;
            return a.getId().compareTo(b.getId());
        });
        students.forEach(System.out::println);
        sc.close();
    }
}

final class Student {
    private String id;
    private String name;
    private double score1, score2, score3;
    private String status;

    public Student(String id, String name, double score1, double score2, double score3) {
        this.id = id;
        setName(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        setStatus();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String[] list = name.trim().split("\\s+");
        for (int i = 0; i < list.length; i++)
            list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1).toLowerCase();
        this.name = String.join(" ", list);
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus() {
        if (Double.parseDouble(getScore()) >= 24) status = "TRUNG TUYEN";
        else status = "TRUOT";
    }
    
    private String getPriorityScore() {
        switch(id.substring(2, 3)) {
            case "1":
                return "0.5";
            case "2":
                return "1";
            default:
                return "2.5";
        }
    }
    
    public String getScore() {
        double score = score1*2+score2+score3 + Double.parseDouble(getPriorityScore());
        if (score == (int) score)
            return Integer.toString((int) score);
        return String.format("%.1f", score);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getPriorityScore() + " " + getScore() + " " + status;
    }
}