package Xau_ky_tu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07008 {
    static TreeSet<String> set = new TreeSet<>();
    static int[] a = null;
    static int n;
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Try(0, "", -1, 0);
        System.out.println(String.join("\n", set));
    }
    
    public static void Try(int i, String res, int parent, int sz) {
        if(i == n) {
            if(sz > 1)
                set.add(res);
            return ;
        }
        if(a[i] > parent)
            Try(i+1, res + Integer.toString(a[i]) + " ", a[i], sz+1);
        Try(i+1, res, parent, sz);
    }
}
