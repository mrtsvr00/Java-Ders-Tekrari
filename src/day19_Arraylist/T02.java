package day19_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {

        ///Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //        //liste olarak dondurecek bir method olusturun.

        List<String>isimlerListesi=isimDondur();
        System.out.println(isimlerListesi);


    }
    public static List<String> isimDondur(){

        List<String>isimListesi=new ArrayList<>();
        String girilenIsim="";
        Scanner scan=new Scanner(System.in);



        while(!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("Lutfen isim giriniz");
            girilenIsim=scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                isimListesi.add(girilenIsim);
            }


        }

        return isimListesi;
    }
}
