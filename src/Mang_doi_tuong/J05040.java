package Mang_doi_tuong;

import java.util.ArrayList;
import java.util.Scanner;
class Staff {
	private String id, name;
	private long dailyWage, workDay;
	private String position;

	public Staff(String id, String name, long dailyWage, long workDay, String position) {
		this.id = id;
		this.name = name;
		this.dailyWage = dailyWage;
		this.workDay = workDay;
		this.position = position;
	}

	private long getWage() {
		return dailyWage*workDay;
	}

	private long getBonus() {
		if(workDay >= 25) return (long) (getWage()*0.2);
		if(workDay >= 22) return (long) (getWage()*0.1);
		return 0;
	}

	private long getPositionBonus() {
		switch (position) {
			case "GD":
				return 250000;
			case "PGD":
				return 200000;
			case "TP":
				return 180000;
			default:
				return 150000;
		}
	}

	public long getSalary() {
		return getWage() + getBonus() + getPositionBonus();
	}

	@Override
	public String toString() {
		return id + " " + name + " " + getWage() + " " + getBonus() + " " + getPositionBonus() + " " + getSalary();
	}
}
public class J05040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Staff> list = new ArrayList<>();
		for (int i = 1; i <= n; i++)
			list.add(new Staff(String.format("NV%02d", i), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine()));
		list.forEach(System.out::println);
        sc.close();
	}
}


