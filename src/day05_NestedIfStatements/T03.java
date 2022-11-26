package day05_NestedIfStatements;

import java.util.Scanner;

public class T03 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        //yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0) {
            if (sayi % 10 == 0) System.out.println("10 un kati");
            else System.out.println("10 un kati degil");

        } else
            if (sayi<0) System.out.println("sayi negatiftir");
            else System.out.println("sayi pozitiftir");
    }
}
