package day05_ifElseIfStatements;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {


        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak ve boyunuzu cm cinsinden giriniz");
        int girilenKilo= scan.nextInt();
        int girilenBoy= scan.nextInt();
        int vke= girilenKilo*1000 / girilenBoy*girilenBoy;

        if (vke>=30)
            System.out.println("Obez");
        else if (vke>=25)
            System.out.println("Kilolu");
        else if (vke>=20)
            System.out.println("Normal");
        else
            System.out.println("Zayif");

        }
    }

