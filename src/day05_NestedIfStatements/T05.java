package day05_NestedIfStatements;

import java.util.Scanner;

public class T05 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();

        if (sayi1<sayi2) System.out.println(sayi1);
        else if (sayi2>sayi1) System.out.println(sayi2);
        else System.out.println("gecersiz giris");
    }
}
