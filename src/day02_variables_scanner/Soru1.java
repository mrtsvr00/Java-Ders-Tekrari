package day02_variables_scanner;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime , bir harf , bir rakam giriniz");
        String kelime=scan.nextLine();
        char harf=scan.next().charAt(0);
        int sayi= scan.nextInt();

        System.out.println("girilen kelime : " + kelime+
                           "\ngirilen harf : " + harf +
                           "\ngirilen sayi : " + sayi);

    }
}
