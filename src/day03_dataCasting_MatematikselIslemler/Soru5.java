package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {


        //  Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //  ve bolum isleminin sonucununun tamsayi kismini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli , bir tamsayi giriniz");
        double ondalikliSayi=scan.nextDouble();
        int tamSayi=scan.nextInt();

        System.out.println((int)(ondalikliSayi/tamSayi));
    }
}
