package day12_whileLoop;

import java.util.Scanner;

public class T05 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun.

      Scanner scan=new Scanner(System.in);
        System.out.println("ussu hesaplanacak sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println("sayinin ussunu giriniz");
        int us=scan.nextInt();

        usHesapla(sayi, us);




    }
    public static void usHesapla(int sayi,int us){
        int sonuc=1;

        while(us>0){
            sonuc*=sayi;


            us--;

        }
        System.out.println(sonuc);


    }
}
