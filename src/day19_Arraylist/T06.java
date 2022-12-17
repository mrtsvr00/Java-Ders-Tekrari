package day19_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T06 {
    public static void main(String[] args) {


        //Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        //tamsayilari bir liste olarak bize donduren bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tam bolenlerini gormek istediginiz sayiyi giriniz");
        int girilenSayi=scan.nextInt();


        if (girilenSayi<0) System.out.println("Gecersiz giris");
        else {
            List<Integer>tamBolenlerListesi=pozitifTamBolenDondur(girilenSayi);
            System.out.println(tamBolenlerListesi);
        }


    }
    public static List<Integer>pozitifTamBolenDondur(int girilenSayi){


        List<Integer>tamBolenlerListesi=new ArrayList<>();

        for (int i = 1; i <=girilenSayi ; i++) {

            if (girilenSayi%i==0){
                tamBolenlerListesi.add(i);

            }



        }
        return tamBolenlerListesi;

    }
}
