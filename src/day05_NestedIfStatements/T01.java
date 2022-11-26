package day05_NestedIfStatements;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Cinsiyetinizi ve yasinizi giriniz");
        char cinsiyet=scan.next().charAt(0);
        int yas= scan.nextInt();

        if (cinsiyet=='E' || cinsiyet=='e') {
            if (yas <= 0) System.out.println("gecersiz giris");
            else if (yas < 65) System.out.println("Emekli olmak icin : " + (65 - yas) + "yil daha calisman gerekir");
            else System.out.println("emekli olabilirsin");
        }else if (cinsiyet=='K' || cinsiyet=='k'){
            if (yas <= 0) System.out.println("gecersiz giris");
            else if (yas < 60) System.out.println("Emekli olmak icin : " + (60 - yas) + "yil daha calisman gerekir");
            else System.out.println("emekli olabilirsin");
        }else
            System.out.println("gecersiz giris");

    }
}
