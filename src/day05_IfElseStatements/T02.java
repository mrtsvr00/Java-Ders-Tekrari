package day05_IfElseStatements;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int girilenNot= scan.nextInt();

        if (girilenNot>=50)
            System.out.println("Sinifi Gectin");
        else
            System.out.println("Maalesef kaldin");
    }
}
