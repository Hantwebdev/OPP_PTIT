/*
package Khai_bao_lop_va_doi_tuong;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
public class J04022 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
        in.close();
    }
}

class WordSet {
    private TreeSet<String> set;

    public WordSet() {
    }

    public WordSet(String s) {
        set = new TreeSet<>();
        set.addAll(Arrays.asList(s.trim().toLowerCase().split("\\s+")));
    }

    public TreeSet<String> getSet() {
        return set;
    }

    public void setSet(TreeSet<String> set) {
        this.set = set;
    }
    
    public String union(WordSet other) {
        TreeSet<String> newTree = (TreeSet<String>) set.clone();
        newTree.addAll(other.getSet());
        return String.join(" ", newTree);
    }
    
    public String intersection(WordSet other){ 
        TreeSet<String> newTree = (TreeSet<String>) set.clone();
        newTree.retainAll(other.getSet());
        return String.join(" ", newTree);
    }
}
 */
