package Vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> m = new HashMap<>();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (m.containsKey(n) == true)
                m.put(n, m.get(n) + 1);
            else
                m.put(n, 1);
        }
        Set<Integer> set = m.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + m.get(key));
        }
        sc.close();
    }
}