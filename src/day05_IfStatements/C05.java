package day05_IfStatements;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int girilenNot=scan.nextInt();

        if (girilenNot>=50)
            System.out.println("Sinifi Gectin");
        if (girilenNot<=50)
            System.out.println("Maalesef Kaldin");
    }
}
