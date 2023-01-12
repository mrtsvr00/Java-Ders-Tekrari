package day19_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T05 {
    public static void main(String[] args) {


        //Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        //bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi<0 ){
            System.out.println("Fibonacci serisi icin 0'dan buyuk tamsayi girmelisin");
        }else if(girilenSayi==0) {
            System.out.println("0'dan kucuk fibonacci sayisi yoktur");
        } else if (girilenSayi==1) {
            System.out.println("1'den kucuk tek fibonacci sayisi vardir : 0");
        }else {
            fibonacciSayilariniyazdir(girilenSayi);

    }




    }

    private static void fibonacciSayilariniyazdir(int girilenSayi) {

        List<Integer>fibonacciSayilari=new ArrayList<>();
        fibonacciSayilari.add(0);
        fibonacciSayilari.add(1);
        fibonacciSayilari.add(1);

        int yeniFibonacciSayisi=0;
        int index=3;

        while (yeniFibonacciSayisi<girilenSayi){
            yeniFibonacciSayisi=fibonacciSayilari.get(index-2)+fibonacciSayilari.get(index-1);
            if (yeniFibonacciSayisi<girilenSayi){
                fibonacciSayilari.add(yeniFibonacciSayisi);
            }
            index++;
        }
        System.out.println(fibonacciSayilari);


    }
}
