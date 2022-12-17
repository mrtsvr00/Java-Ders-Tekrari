package day07_forLoops;

import java.util.Random;
import java.util.Scanner;

public class T13 {
    public static void main(String[] args) {
        /*
        Rastgele bir sayı üreten ve kullanıcıdan sayının ne olduğunu tahmin etmesini isteyen bir program yazın.
        Kullanıcının tahmini rastgele sayıdan yüksekse, program "Çok yüksek, tekrar dene" görüntülemelidir.
        Kullanıcının tahmini rastgele sayıdan düşükse, program "Çok düşük, tekrar dene" görüntülemelidir.
        Program, kullanıcı rasgele sayıyı doğru tahmin edene kadar tekrarlanan bir döngü kullanmalıdır.
         */
        Scanner scan=new Scanner(System.in);

        Random rnd=new Random();
        int piyangoSayisi= rnd.nextInt(100);

        boolean dogruTahmin=true;
        int kullaniciTahmini=0;
        int sayac=0;

        while(dogruTahmin){
            System.out.println("Sayi giriniz");
            kullaniciTahmini= scan.nextInt();
            sayac++;



            if (kullaniciTahmini==piyangoSayisi) {
                System.out.println("bravo");
                break;
            }else if (kullaniciTahmini>piyangoSayisi) {
                System.out.println("Çok yüksek, tekrar dene");
            }else if (kullaniciTahmini<piyangoSayisi)
                System.out.println("Çok dusuk, tekrar dene");
            }


        }


    }

