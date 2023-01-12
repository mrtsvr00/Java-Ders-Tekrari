package day18_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T09 {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan pozitif bir tamsayi alip,
        //         o tamsayidan kucuk Fibonacci sayilarini bir liste olarak
        //          yazdirin
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 .....

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi<0) System.out.println("Fibonacci serisi icin 0'dan buyuk tamsayi girmelisin");
        else if (sayi==0) System.out.println("0'dan kucuk fibonacci sayisi yoktur");
        else if (sayi==1) System.out.println("1'den kucuk tek fibonacci sayisi vardir : 0");
        else fibonaccisayilariniYazdir(sayi);




    }

    public static void fibonaccisayilariniYazdir(int sayi) {
        List<Integer> fibonacciListesi = new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);

        int yeniFibonacciSayisi=0;
        int index=3;

        while(yeniFibonacciSayisi<sayi){
            yeniFibonacciSayisi=fibonacciListesi.get(index-2) + fibonacciListesi.get(index-1);

            if (yeniFibonacciSayisi<sayi){
                fibonacciListesi.add(yeniFibonacciSayisi);
            }
            index++;
        }

        System.out.println(fibonacciListesi);
    }
}
