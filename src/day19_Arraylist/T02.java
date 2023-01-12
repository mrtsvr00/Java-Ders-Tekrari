package day19_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {

        ///Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //        //liste olarak dondurecek bir method olusturun.

        List<String> isimlerListesi = listeDondur();

        System.out.println(listeDondur());


    }

    public static List<String> listeDondur() {

        Scanner scan = new Scanner(System.in);
        String girilenIsim = "";

        List<String> isimListesi = new ArrayList<>();


        while (!girilenIsim.equalsIgnoreCase("q")) {
            System.out.println("isim giriniz");
            girilenIsim = scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")) {
                isimListesi.add(girilenIsim);
            }

        }
        return isimListesi;
    }
}
