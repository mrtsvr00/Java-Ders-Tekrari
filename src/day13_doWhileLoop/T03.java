package day13_doWhileLoop;

import java.util.Scanner;

public class T03 {
    public static void main(String[] args) {

        ////Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        //        //bulunuz, tamkare ise true değilse false yazdırınız.
        //        //Ornek : input : 16, output: 4

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi girinoz");
        int sayi=scan.nextInt();
        int karekok=1;
        boolean sonuc=true;

       do {
           if (karekok*karekok==sayi){
               sonuc=true;
               break;

           }else
               sonuc=false;
           karekok++;

       }while(karekok*karekok<=sayi);
        System.out.println(sonuc);

    }
}

