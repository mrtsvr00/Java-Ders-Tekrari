package day05_ifElseIfStatements;

import java.util.Scanner;

public class T03 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedi, liste fiyatini ve musteri kartiniz varmi giriniz");
        int urunAdedi= scan.nextInt();
        double listeFiyati=scan.nextDouble();
        boolean kartVarmi= false;

        double toplamFiyat = 0;

        if (kartVarmi){
            if (urunAdedi<=0) {
                System.out.println("Gecersiz Giris");
            }else if (urunAdedi<=10) {
                toplamFiyat = urunAdedi * listeFiyati * 0.8;
                System.out.println("%20 indirimli fiyat : " + toplamFiyat);
            }else{
            toplamFiyat = urunAdedi * listeFiyati * 0.85;
            System.out.println("%15 indirimli fiyat : " + toplamFiyat);
            }


        }else {
            if (urunAdedi <= 0) {
                System.out.println("Gecersiz Giris");

            } else if (urunAdedi <= 10) {
                toplamFiyat = urunAdedi * listeFiyati * 0.85;
                System.out.println("%20 indirimli fiyat : " + toplamFiyat);
            } else {
                toplamFiyat = urunAdedi * listeFiyati * 0.9;
                System.out.println("%15 indirimli fiyat : " + toplamFiyat);
            }
        }
    }
}
