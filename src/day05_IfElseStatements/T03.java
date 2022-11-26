package day05_IfElseStatements;

import java.util.Scanner;

public class T03 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int girilenYas= scan.nextInt();

        if (girilenYas>=65)
            System.out.println("Emekli olabilirsin");
        else
            System.out.println("Emekli olmak icin : " + (65-girilenYas) + " yil daha calisman gerekir");
    }
}
