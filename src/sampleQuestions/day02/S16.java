package sampleQuestions.day02;

import java.util.Scanner;

public class S16 {
    public static void main(String[] args) {
        //Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın.
        //Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
        //Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        //Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
        //Loopun içerisinde String methodlarında

        Scanner scan=new Scanner(System.in);
        String kelime="";
        String yeniKelime="";

        while(kelime.length()<5){
            System.out.println("kelime giriniz");
            kelime=scan.nextLine();

            if (kelime.length()<5){
                System.out.println("yeni kelime giriniz");
            }else {
                yeniKelime=kelime.substring(kelime.length()-3) + kelime.substring(kelime.length()-3);
            }


        }
        System.out.println(yeniKelime);

    }
}
