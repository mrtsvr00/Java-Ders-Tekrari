package day12_whileLoop;

import java.util.Scanner;

public class T04 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        //istediginde 0'a basmasini soyleyin
        //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        //bunlarin toplaminin kac oldugunu yazdirin
        //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        //negatif sayiyi sayi adedine ve toplama eklemeyin

        int sayi=1;
        int sayac=0;
        int toplam=0;
        while (sayi!=0){
            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen pozitif tamsayilar giriniz\nbitirmek istediginizde 0 a basiniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        }

        System.out.println("kac adet tamsayi girildigi : " + (sayac-1) + "\ngirilen sayilar toplami : " + toplam);


    }
}
