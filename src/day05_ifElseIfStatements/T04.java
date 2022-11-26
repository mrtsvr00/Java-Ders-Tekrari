package day05_ifElseIfStatements;

import java.util.Scanner;

public class T04 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan = new Scanner(System.in);


        System.out.println("Hangi birime cevirmek istediginizi giriniz");
        String istenilenBirim = scan.nextLine();
        System.out.println("Lutfen mesafeyi km olarak giriniz");
        int girilenKm = scan.nextInt();

        int metreCevir=0;
        int cmCevir=0;


       if (istenilenBirim.equalsIgnoreCase("metre")) {
           metreCevir = girilenKm * 1000;
           System.out.println(metreCevir);

       } else if (istenilenBirim.equalsIgnoreCase("santimetre")){
           cmCevir=girilenKm*100000;
           System.out.println(cmCevir);
       }else
           System.out.println("istediginiz birim sisteme kayitli degil");




    }



    }

