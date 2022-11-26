package day02_variables_scanner;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {


        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        //yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli sayi , bir tamsayi giriniz");
        double ondalikliSayi=scan.nextDouble();
        double tamsayi=scan.nextInt();

        System.out.println("sayilar toplami : " + (ondalikliSayi+tamsayi) +
                           "\nsayilar carpimi : " + (ondalikliSayi*tamsayi));
    }
}
