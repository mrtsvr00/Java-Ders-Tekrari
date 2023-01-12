package day12_whileLoop;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.


        Scanner scan=new Scanner(System.in);
        System.out.println("sayi girinoz");
        int sayi=scan.nextInt();

        int rakTop=0;
        int birBas=0;

        while(sayi>0){
            birBas=sayi%10;
            rakTop+=birBas;
            sayi=sayi/10;

        }
        System.out.println(rakTop);




    }
}
