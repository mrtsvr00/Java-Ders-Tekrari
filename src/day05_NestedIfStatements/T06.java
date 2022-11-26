package day05_NestedIfStatements;

import java.util.Scanner;

public class T06 {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        if (sayi>=0) {
            System.out.println(sayi);
        }else {
            sayi = sayi * -1;
            System.out.println(sayi);
        }
    }
}
