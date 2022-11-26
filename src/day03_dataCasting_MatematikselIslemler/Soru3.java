package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {


        // Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        // ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        System.out.println((byte)sayi);







    }
}
