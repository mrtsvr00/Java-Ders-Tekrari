package day02_variables_scanner;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {


        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi,soyisminizi ve yasinizi giriniz");
        String isim=scan.nextLine();
        String soyisim= scan.nextLine();
        int yas=scan.nextInt();

        System.out.println("girilen bilgiler : " + isim.charAt(0) + " " + soyisim + ", " + yas);


    }
}
