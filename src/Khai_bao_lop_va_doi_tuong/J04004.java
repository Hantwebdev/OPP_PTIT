package Khai_bao_lop_va_doi_tuong;

import java.util.Scanner;

public class J04004 {
   private long tuSo, mauSo;

    public J04004(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public long gcd(){
        while (this.mauSo != 0){
            long du = this.tuSo % this.mauSo;
            this.tuSo = this.mauSo;
            this.mauSo = du;
        }
        return  this.tuSo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long p1 = sc.nextLong();
        long p2 = sc.nextLong();
        long q1 = sc.nextLong();
        long q2 = sc.nextLong();
        long tuSo = p1 * q2 + p2 * q1;
        long mauSo = p2 * q2;
        J04004 x = new J04004(tuSo, mauSo);
        System.out.println(tuSo/x.gcd() + "/" + mauSo/x.gcd());
        sc.close();
}
}
