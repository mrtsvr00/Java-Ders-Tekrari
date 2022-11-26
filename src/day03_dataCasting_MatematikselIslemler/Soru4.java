package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //        isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen iki ondalikli sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println((int)(sayi1/sayi2));
    }
}
