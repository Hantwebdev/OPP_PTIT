package Khai_bao_lop_va_doi_tuong;

import java.util.Scanner;
class Pair <K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public boolean isPrime() {
        int inKey = Integer.parseInt(this.key.toString()), inVal = Integer.parseInt(this.value.toString());
        if (inKey < 2 || inVal < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(inKey); i++) {
            if (inKey%i == 0) {
                return false;
            }
        }
        
        for (int i= 2; i <= Math.sqrt(inVal); i++) {
            if (inVal%i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return this.key + " " + this.value;
    }
}

public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
        sc.close();
    }
}
