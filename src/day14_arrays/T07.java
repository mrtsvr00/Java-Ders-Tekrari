package day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class T07 {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu
        // ve elementlerini alip array’i olusturan
        // ve bize donduren bir method olusturun.

        System.out.println(Arrays.toString(arrayOlustur()));


    }
    public static int[] arrayOlustur(){

        Scanner scan=new Scanner(System.in);
        System.out.println("array in uzunlugunu giriniz");
        int uzunluk = scan.nextInt();

        int []kullaniciArrayi=new int[uzunluk];

        for (int i = 0; i < kullaniciArrayi.length; i++) {
            System.out.println("arraye eleman girin");
            kullaniciArrayi[i]=scan.nextInt();

        }

       return kullaniciArrayi;
    }
}

