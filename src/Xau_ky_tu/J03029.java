package Xau_ky_tu;

import java.util.Scanner;

public class J03029 {

    String cleanParagraph(String source) {
        source = source.trim();
        source = source.replaceAll("\\s+", " ");
        source = source.replaceAll("\\s+([.!?])", "$1");
        source = source.toLowerCase();
        source = source.substring(0, 1).toUpperCase() + source.substring(1);
        if (Character.isAlphabetic(source.charAt(source.length() - 1))) {
            source += '.';
        }
        return source;
    }

    void solve(int numTest) {
        while (cin.hasNext()) {
            String s = cin.nextLine();
            System.out.println(cleanParagraph(s));
        }
    }

    Scanner cin = new Scanner(System.in);

    void Run() {
        int t = 1;
        for (int i = 1; i <= t; i++) {
            solve(i);
        }
    }

    public static void main(String[] args) {
        new J03029().Run();
    }
}