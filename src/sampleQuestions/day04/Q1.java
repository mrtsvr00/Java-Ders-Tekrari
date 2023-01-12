package sampleQuestions.day04;

import java.util.Scanner;

public class Q1 {
    //Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
    //Örnek:
    //      Sayı: 1238
    //      Sayının Tersi: 8321
    //İpucu:  Loop kullanabilirsiniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();

        String sayiStr=""+ sayi;
        String tersSayiStr="";

        for (int i = sayiStr.length(); i >0 ; i--) {
            tersSayiStr+=i;

        }
        System.out.println(tersSayiStr);
        int tersSayi=Integer.parseInt(tersSayiStr);
        System.out.println(tersSayi);

    }
}
