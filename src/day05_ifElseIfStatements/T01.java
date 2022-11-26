package day05_ifElseIfStatements;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi ve yasinizi giriniz");
        char cinsiyet=scan.nextLine().charAt(0);
        int girilenYas=scan.nextInt();

        if (cinsiyet=='E' || cinsiyet=='e')

            if (girilenYas>=65)
                System.out.println("Emekli olabilirsin");
            else
                System.out.println("Emekli olabilmek icin : " + (65-girilenYas) + "yil daha calisman gerekir");

        else if (cinsiyet=='K' || cinsiyet=='k')

            if (girilenYas>=60)
                System.out.println("Emekli olabilirsin");
            else
                System.out.println("Emekli olabilmek icin : " + (60-girilenYas) + " yil daha calisman gerekir");

        else
            System.out.println("Gecersiz Giris");




    }
}
