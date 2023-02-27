package Khai_bao_lop_va_doi_tuong;

import java.util.Scanner;

public class J04003 {
    private long tuSo; 
    private long mauSo;

    public J04003(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public long gcd(){
        while(this.mauSo != 0){
            long du = this.tuSo % this.mauSo;
            this.tuSo = this.mauSo;
            this.mauSo = du;
        }
        return this.tuSo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo = sc.nextLong();
        long mauSo = sc.nextLong();
        J04003 x = new J04003(tuSo, mauSo);
        System.out.println(tuSo/x.gcd() + "/" + mauSo/x.gcd());
        sc.close();
    }
}
