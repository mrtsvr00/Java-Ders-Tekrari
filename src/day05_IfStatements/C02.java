package day05_IfStatements;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char ilkHarf=scan.next().charAt(0);

        if (ilkHarf=='O' || ilkHarf=='o')
            System.out.println("Ocak");
        if (ilkHarf=='S' || ilkHarf=='s')
            System.out.println("Subat");
        if (ilkHarf=='M' || ilkHarf=='m')
            System.out.println("Mart,Mayis");
        if (ilkHarf=='N' || ilkHarf=='n')
            System.out.println("Nisan");
        if (ilkHarf=='H' || ilkHarf=='h')
            System.out.println("Haziran");
        if (ilkHarf=='T' || ilkHarf=='t')
            System.out.println("Temmuz");
        if (ilkHarf=='A' || ilkHarf=='a')
            System.out.println("Haziran");
        if (ilkHarf=='E' || ilkHarf=='e')
            System.out.println("Eylul,Ekim");
        if (ilkHarf=='K' || ilkHarf=='k')
            System.out.println("Kasim");
        if (ilkHarf=='A' || ilkHarf=='a')
            System.out.println("Aralik,Agustos");
        }

    }

