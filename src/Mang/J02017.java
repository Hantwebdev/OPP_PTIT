package Mang;

import java.util.ArrayList;
import java.util.Scanner;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < t; i++){
                int num = sc.nextInt();
                if(list.isEmpty()) list.add(num);
                else{
                    if((list.get(list.size() - 1) + num) % 2 == 0){
                        list.remove(list.size() - 1);
                    }
                    else list.add(num);
                }
            }
            System.out.println(list.size());
        } finally {
            sc.close();
        }
    }
}
